package lesson3;

import java.util.Scanner;

public class DayIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ");
        String namePartDay = scanner.next();
        switch (namePartDay) {
            case "Morning" :
                System.out.print("Start in 6, ends in 12");
                break;
            case "Day" :
                System.out.print("Start in 12, ends in 18");
                break;
            case "Evening" :
                System.out.print("Start in 18, ends in 22");
                break;
            case "Night" :
                System.out.print("Start in 22, ends in 6");
                break;
            default: System.out.print("Incorrect input");
        }
    }
}
