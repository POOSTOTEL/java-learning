package lesson4;

import java.util.Scanner;

public class Search0AndCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size:");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Please, input array value:");
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print((int)(i + 1) + " elem = ");
            arr[i] = scanner.nextInt();
            if (arr[i] == 0) {
                counter++;
            }
        }
        if (counter != 0) {
            System.out.print("Number of zeros: " + counter + ".");
        } else {
            System.out.print("There is no 0 in this array.");
        }
    }
}
