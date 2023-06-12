package Lesson1;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length of square A");
        int a = scanner.nextInt();
        System.out.println("Input length of square B");
        int b = scanner.nextInt();
        int ploscha = a * b;
        int perimetr = (a + b) * 2;
        String perimetrNameStr = "Perimetr: ";
        String newStr = "\"Perimetr: \"";
        System.out.println("Ploshcha: " + ploscha);
        System.out.println(newStr + perimetrNameStr + perimetr);
    }
}
