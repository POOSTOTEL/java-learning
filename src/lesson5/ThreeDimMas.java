package lesson5;

import java.util.Random;
import java.util.Scanner;

public class ThreeDimMas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a[][][] = new int[random.nextInt(1, 5)][random.nextInt(1, 5)][random.nextInt(1, 5)];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = random.nextInt(0, 9);
                    System.out.println("a[" + i + "][" + j + "][" + k + "] = " + a[i][j][k]);
                }
            }
        }
        System.out.println("Enter how much to increase: ");
        int change = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] += change;
                    System.out.println("a[" + i + "][" + j + "][" + k + "] = " + a[i][j][k]);
                }
            }
        }

    }
}
