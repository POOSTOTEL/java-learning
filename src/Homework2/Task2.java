package Homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input price:");
        float money = scanner.nextFloat();
        String trash;
        trash = scanner.nextLine();
        boolean discount;
        discount = money >= 1400.0 ? true : false;
        System.out.println("Discount is " + discount);
        money = discount ? (float)(money * 0.93) : money;
        System.out.print("Final price: " + money);
    }
}
