package lesson3;

import java.util.Scanner;

public class PartWeekIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ");
        String namePartDay = scanner.next().toLowerCase();
        switch (namePartDay) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.print("Workday");
            //case "tuesday" -> System.out.print("Workday");
            //case "wednesday" -> System.out.print("Workday");
            //case "thursday" -> System.out.print("Workday");
            //case "friday" -> System.out.println("Workday");
            case "saturday", "sunday" -> System.out.println("Weekend");
            //case "sunday" -> System.out.println("Weekend");
            default -> System.out.print("Incorrect input");
        }
    }
}
