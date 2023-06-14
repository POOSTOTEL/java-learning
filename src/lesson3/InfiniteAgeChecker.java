package lesson3;

import java.util.Scanner;

public class InfiniteAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean checker = true;
        while (checker) {
            System.out.println("Input age:");
            byte IntAge = scanner.nextByte();
            if (IntAge >= 18) {
                System.out.println("You can see this content!");
            } else {
                System.out.println("You have low age :(");
            }
            System.out.println("If you wont stop program, write N.");
            switch (scanner.next().toLowerCase()) {
                case "n" -> checker = false;
            }
        }
    }
}
