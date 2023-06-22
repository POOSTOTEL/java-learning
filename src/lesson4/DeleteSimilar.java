package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteSimilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size:");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Please, input array value:");
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print((int) (i + 1) + " elem = ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the value to be removed:");
        int delete = scanner.nextInt();
        //Большой вопрос, каким образом высвобождать память и делать не через костыль
        for (int i = 0; i < size; i++) {
            if (delete == arr[i]) {
                size--;
                for (int j = i; j < size; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
