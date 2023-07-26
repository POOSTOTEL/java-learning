package homework12.documentChecker;

import java.util.Scanner;

public class RegexDocsChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Номер документа: ");
        String line = scanner.nextLine();
        try {
            if (!line.startsWith("abc")) {
                System.out.println("Начало блока проверки abc.");
                throw new DoesNotStartWithABCException("Ошибка, строка не начинается с \"abc\"", 404);
            } else {
                try {
                    System.out.println("Начало блока проверки 555.");
                    if (!line.contains("555")) {
                        throw new DoesNotContain555Exception("Ошибка, строка не содержит \"555\"", 909);
                    } else {
                        try {
                            System.out.println("Начало блока проверки 1a2b.");
                            if (!line.endsWith("1a2b")) {
                                throw new DoesNotEndWith1a2bException("Ошибка, строка не заканчивается на \"1a2b\"", 888);
                            }
                        } catch (DoesNotEndWith1a2bException e3) {
                            System.out.println(e3.getMessage());
                        } finally {
                            System.out.println("Конец блока проверки 1a2b.");
                        }
                    }
                } catch (DoesNotContain555Exception e2) {
                    System.out.println(e2.getMessage());
                } finally {
                    System.out.println("Конец блока проверки 555.");
                }
            }
        } catch (DoesNotStartWithABCException e1) {
            System.out.println(e1.getMessage());
        } finally {
            System.out.println("Конец блока проверки abc.");
        }
    }
}
