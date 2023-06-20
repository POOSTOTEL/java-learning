package lesson4;

import java.util.Scanner;

public class ArraysWith5Elems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[] = new int[5], arr2[] = new int[5];
        System.out.println("Please, input array value:");
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print((int) (i + 1) + " elem in first array = ");
            arr1[i] = scanner.nextInt();
            sum1 += arr1[i];
            System.out.print((int) (i + 1) + " elem in second array = ");
            arr2[i] = scanner.nextInt();
            sum2 += arr2[i];
        }
        sum1 /= 5;
        sum2 /= 5;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        if (sum1 > sum2) {
            System.out.println(sum1 + " > " + sum2);
        } else if (sum1 < sum2) {
            System.out.println(sum1 + " < " + sum2);
        } else {
            System.out.println(sum1 + " = " + sum2);
        }
    }
}
