package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Plus1ToNumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number:");
        int num = scanner.nextInt();
        int temp = num, counter = 0;
        while (temp != 0) {
            temp /= 10;
            counter++;
        }
        int arr[] = new int[counter];
        for (int i = arr.length - 1; num != 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }
        boolean endOfNum = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 9) {
                arr[i]++;
                break;
            }
            else {
                arr[i] = 0;
                if (arr[0] == 9) {
                    endOfNum = true;
                }
            }
        }
        if (endOfNum) {
            int arrNew[] = new int[counter + 1];
            arrNew[0] = 1;
            System.out.print(Arrays.toString(arrNew));
        }
        else {
            System.out.print(Arrays.toString(arr));
        }
    }
}
