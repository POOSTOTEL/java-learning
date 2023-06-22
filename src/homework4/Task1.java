package homework4;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        String fruits[] = new String[4];
        Random random = new Random();
        for (int i = 0; i < fruits.length; i++) {
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
        System.out.println(fruits[1] + ", " + fruits[3]);
        switch (random.nextInt(1, 8)) {
            case 1 -> fruits[2] = "apple";
            case 2 -> fruits[2] = "orange";
            case 3 -> fruits[2] = "pineapple";
            case 4 -> fruits[2] = "pear";
            case 5 -> fruits[2] = "banana";
            case 6 -> fruits[2] = "grape";
            case 7 -> fruits[2] = "plum";
            case 8 -> fruits[2] = "Corsica peach";
        }
        System.out.println(Arrays.toString(fruits));
        Arrays.sort(fruits);
        System.out.print(Arrays.toString(fruits));
    }
}
