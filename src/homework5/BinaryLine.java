package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number in binary style:");
        String line = scanner.nextLine();
        char array[] = line.toCharArray();
        boolean trueLine = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != '0' && array[i] != '1') {
                trueLine = false;
                System.out.print("Error input!");
                break;
            }
        }
        if (trueLine) {
            int numInDecSys = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] == '1') {
                    numInDecSys += Math.pow(2, array.length - i - 1);
                }
            }
            System.out.print(numInDecSys);
        }
    }
}
