package lesson3;

import javax.naming.InsufficientResourcesException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input time:");
        byte inputTime = scanner.nextByte();
        if (inputTime >= 6 && inputTime < 12) {
            System.out.print("Morning");
        } else if (inputTime >= 12 && inputTime < 18) {
            System.out.print("Day");
        } else if (inputTime >= 18 && inputTime < 22) {
            System.out.print("Evening");
        } else if ((inputTime >= 22 && inputTime < 24)||(inputTime >= 0 && inputTime < 6)) {
            System.out.print("Night");
        } else {
            System.out.println("Incorrect input");
        }
    }
}
