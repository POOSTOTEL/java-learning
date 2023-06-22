package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
        }
        System.out.println(Arrays.toString(array));
        int min = array[0], max = array[0], sum = 0;
        System.out.println("Start min = " + min + "\nStart max = " + max);
        for (int a:
                array) {
            if (a > max) {
                max = a;
            } else if (a < min) {
                min = a;
            }
            sum += a;
        }
        System.out.println("min = " + min + "\nmax = " + max);
        System.out.print("sum = " + sum);
    }
}
