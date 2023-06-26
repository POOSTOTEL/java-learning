package lesson5;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input counter: ");
        int sum = 0, counter = scanner.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i);
            if (counter != i) {
                System.out.print(" + ");
            }
            sum += i;
        }
        System.out.print(" = " + sum);
    }
}
