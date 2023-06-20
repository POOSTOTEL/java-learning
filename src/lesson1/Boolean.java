package lesson1;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        boolean greater;
        System.out.println("Input two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        greater = a < b;
        System.out.println("a < b : " + greater);
        greater = a > b;
        System.out.println("a > b : " + greater);
        greater = a == b;
        System.out.println("a = b : " + greater);
        greater = a != b;
        System.out.println("a != b : " + greater);
        greater = a >= b;
        System.out.println("a >= b : " + greater);
        greater = a <= b;
        System.out.println("a <= b : " + greater);
    }
}
