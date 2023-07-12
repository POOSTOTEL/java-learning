package lesson10;

import java.util.Scanner;

public class WorkWithStringBuilderType {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Please, don't touch my money!!!");
        stringBuilder.append(" Wow bro!");
        stringBuilder.insert(4, "y");
        stringBuilder.delete(3, 6);
        stringBuilder.reverse();
        String str = String.valueOf(stringBuilder);
        System.out.println(str);

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        StringBuilder string = new StringBuilder("");
        int startIndex = String.valueOf(num1).length();
        System.out.println(string.append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2));
        string.delete(startIndex + 1, startIndex + 2);
        string.insert(startIndex + 1, "-");
        int length = string.length();
        string = new StringBuilder(string.substring(0, string.indexOf("=") + 1));
        System.out.println(string.append(" ").append(num1 - num2));
        string.setLength(0);
        System.out.println(string.append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2));
        string.replace(startIndex, startIndex + 3, "  *  ");
        System.out.println(string);


    }
}
