package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandEvenSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size array: ");
        int size = scanner.nextInt();
        double masDouble[] = new double[size];
        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = Math.random() * 10;
        }
        System.out.println(Arrays.toString(masDouble));
        System.out.println("Square even-numbered elements:");
        for (int i = 0; i < masDouble.length; i++) {
            if (i % 2 != 0) {
                System.out.print((masDouble[i] * masDouble[i]) + " ");
            }
            else {
                System.out.print(masDouble[i] + " ");
            }
        }
    }
}
