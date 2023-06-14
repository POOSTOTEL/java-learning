package lesson3;

import java.util.Scanner;

public class DayIdentifierNewStyle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ");
        String namePartDay = scanner.next();
        switch (namePartDay) {
            case "Morning" -> System.out.print("Start in 6, ends in 12");
            case "Day" -> System.out.print("Start in 12, ends in 18");
            case "Evening" -> System.out.print("Start in 18, ends in 22");
            case "Night" -> System.out.print("Start in 22, ends in 6");
            default -> System.out.print("Incorrect input");
        }
    }
}
