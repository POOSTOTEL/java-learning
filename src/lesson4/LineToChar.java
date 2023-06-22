package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class LineToChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write line:");
        String line = scanner.nextLine();
        char arr[] = line.toCharArray();
        System.out.println("Write symbol:");
        char symbol = scanner.nextLine().charAt(0);
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == symbol) {
                System.out.print(i + "\\");
                counter++;
            }
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
