package lesson5;

import java.util.Random;

public class DiagonalTwoDimMas {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(3, 7);
        int arr[][] = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(0, 9);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println(arr[i][i]);
        }
        System.out.println();
        for (int i = 0, j = arr.length - 1; j >= 0; j--) {
            for (int k = j; k >= 1; k--) {
                System.out.print("  ");
            }
            System.out.println(arr[i][j]);
            i++;
        }
    }
}
