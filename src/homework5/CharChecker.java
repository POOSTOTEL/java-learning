package homework5;

import java.util.Scanner;

public class CharChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letters[] = new char[128];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char)i;
        }
        System.out.println("Write symbol number:");
        int num = scanner.nextInt();
        System.out.print(num + " number is '" + letters[num] + "'");
    }
}
