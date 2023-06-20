package lesson1;

import java.util.Scanner;

public class Name {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Name worker: ");
        String name = scanner.nextLine();
        System.out.println("Hello dear " + name + "!");
    }
}
