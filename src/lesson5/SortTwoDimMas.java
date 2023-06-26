package lesson5;

import java.util.Arrays;
import java.util.Random;

public class SortTwoDimMas {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[][] = new int[random.nextInt(3, 7)][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int [random.nextInt(3, 7)];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(0, 9);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
