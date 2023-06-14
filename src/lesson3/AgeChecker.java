package lesson3;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input age:");
        byte IntAge = scanner.nextByte();
        if (IntAge >= 18) {
            System.out.println("You can see this content!");
        } else {
            System.out.print("You have low age :(");
        }
    }
}
