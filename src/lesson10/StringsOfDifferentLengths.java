package lesson10;

import java.util.Scanner;

public class StringsOfDifferentLengths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = scanner.nextLine();
        if (str.length() % 2 == 0) {
            System.out.println(str.substring(str.length() / 2 - 1, str.length() / 2 + 1));
        } else {
            System.out.println(str.charAt(str.length() / 2));
        }
    }
}
