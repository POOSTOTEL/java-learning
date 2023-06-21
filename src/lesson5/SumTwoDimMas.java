package lesson5;

import java.util.Random;

public class SumTwoDimMas {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[][] = new int[random.nextInt(3, 5)][random.nextInt(3, 5)];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(0, 9);
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(sum);
    }
}
