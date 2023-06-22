package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LineArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Write size:");
        int size = scanner.nextInt();
        String fruits[] = new String[size];
        for (int i = 0; i < size; i++) {
            switch (random.nextInt(1, 8)) {
                case 1 -> fruits[i] = "apple";
                case 2 -> fruits[i] = "orange";
                case 3 -> fruits[i] = "pineapple";
                case 4 -> fruits[i] = "pear";
                case 5 -> fruits[i] = "banana";
                case 6 -> fruits[i] = "grape";
                case 7 -> fruits[i] = "plum";
                case 8 -> fruits[i] = "Corsica peach";
            }
        }
        System.out.println(Arrays.toString(fruits));
        //Не понял суть задания, попробовал присвоить null, возникло много вопросов
        for (int i = 0; i < size; i += 2) {
            fruits[i] = "0";
        }
        System.out.println(Arrays.toString(fruits));
    }
}
