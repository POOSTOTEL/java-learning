package homework5;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[random.nextInt(5, 15)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 25);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i], minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
