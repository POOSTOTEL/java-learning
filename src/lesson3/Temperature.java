package lesson3;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write temperature: ");
            int temperature = scanner.nextInt();
            if (temperature > -5) {
                System.out.println("Warm");
            } else if (temperature <= -20) {
                System.out.println("Cold");
            } else {
                System.out.println("Normal");
            }
            System.out.println("Do you want to continue? Y/N");
            if (scanner.next().toLowerCase().equals("n")) {
                break;
            }
        }
    }
}
