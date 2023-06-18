package homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size: ");
        String size = scanner.next().toUpperCase();
        switch (size) {
            case "XS" -> System.out.print("Extra small.");
            case "S" -> System.out.print("Small.");
            case "M" -> System.out.print("Medium.");
            case "L" -> System.out.print("Large.");
            case "XL" -> System.out.print("Extra large.");
            case "XXL", "XXXL", "XXXXL", "XXXXXL" -> System.out.print("Extra-extra large.");
            default -> System.out.print("Input Error!");
        }
    }
}
