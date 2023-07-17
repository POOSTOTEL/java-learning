package homework10.stringMethods;

import java.util.Scanner;

public class StringMethodsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу строку: ");
        String userString = scanner.nextLine();
        boolean menu = true;
        while (menu) {
            System.out.println("Выберите интересующий вас пункт меню:");
            System.out.println("1) Распечатать последний символ строки. Используем метод String.charAt().");
            System.out.println("2) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().");
            System.out.println("3) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().");
            System.out.println("4) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().");
            System.out.println("5) Найти позицию подстроки “Java” в строке “I like Java!!!”.");
            System.out.println("6) Заменить все символы “а” на “о”.");
            System.out.println("7) Преобразуйте строку к верхнему регистру.");
            System.out.println("8) Преобразуйте строку к нижнему регистру.");
            System.out.println("9) Вырезать строку Java c помощью метода String.substring().");
            System.out.println("0) Завершить работу со строкой");
            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.print("Последний символ во входящей строке: ");
                    StringMethods.printLastChar(userString);
                }
                case 2 ->
                        System.out.println("Строка заканчивается на \"!!!\"? " + StringMethods.checkEndOfWord(userString));
                case 3 ->
                        System.out.println("Строка начинается на \"I like\"? " + StringMethods.checkTheBeginningOfWord(userString));
                case 4 ->
                        System.out.println("Строка содержит слово \"Java\"? " + StringMethods.checkIfStringContains(userString));
                case 5 ->
                        System.out.println("Позиция слова в входящей строке : " + StringMethods.searchPositionSubstring(userString));
                case 6 -> System.out.println("Все символы заменены: " + StringMethods.replaceLetters(userString));
                case 7 -> System.out.println("Выходная строка: " + StringMethods.makeUppercaseLetters(userString));
                case 8 -> System.out.println("Выходная строка: " + StringMethods.makeLowercaseLetters(userString));
                case 9 -> System.out.println("Вырезанная строка: " + StringMethods.cutSubstring(userString));
                case 0 -> menu = false;
            }
        }
    }
}
