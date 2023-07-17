package homework10.palindrome;

import java.util.Scanner;

public class PalindromeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        System.out.print("Введите номер слова: ");
        Palindrome.checkPalindrome(str, scanner.nextInt());
    }
}
