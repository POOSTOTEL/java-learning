package lesson3;

import java.util.Scanner;

public class MonthIdentifire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Input month:");
            switch (scanner.nextInt()) {
                case 1, 2, 12 -> System.out.println("Winter");
                case 3, 4, 5 -> System.out.println("Spring");
                case 6, 7, 8 -> System.out.println("Summer");
                case 9, 10, 11 -> System.out.println("Autumn");
                default -> System.out.println("Incorrect input");
            }
            System.out.println("Do you want to continue? Y/N");
            if (scanner.next().toLowerCase().equals("n")) {
                return;
            }
        }
    }
}
