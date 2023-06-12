package Lesson1;

import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input num for equal: ");
        int a = scanner.nextInt();
        System.out.println("This num ivent: " + (a % 2 == 0 ? true : false));
    }
}
