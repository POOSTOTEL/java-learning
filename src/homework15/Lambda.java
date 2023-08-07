package homework15;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "ldkfl;skf!";
        Predicate<String> predicate1 = (s) -> {
            if (s.contains("!")) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println("Введите строку для проверки на наличие \"!\"");
        System.out.println(predicate1.test(scanner.nextLine()));
        Predicate<String> predicate2 = (s) -> {
            if (s.contains("?")) {
                return false;
            } else {
                return true;
            }
        };
        System.out.println("Введите строку для проверки на отсутствие \"?\":");
        System.out.println(predicate2.test(scanner.nextLine()));
        Function<String, Character> function = (s) -> {
            return s.charAt(s.length() - 1);
        };
        System.out.println("Введите строку:");
        System.out.println(function.apply(scanner.nextLine()));
        Consumer<String> consumer = s -> {
            System.out.println(s.charAt(s.length() - 1));
        };
        System.out.println("Введите строку:");
        consumer.accept(scanner.nextLine());
        UnaryOperator<String> unaryOperator = (s) -> {
            if (s.length() > 4) {
                return s.substring(1, 3);
            } else {
                return null;
            }
        };
        System.out.println("Введите слово:");
        System.out.println(unaryOperator.apply(scanner.nextLine()));
        Supplier<String> supplier = () -> {
            return "JAVA is the BEST";
        };
        System.out.println(supplier.get());

    }
}
