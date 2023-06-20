package homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, write time: ");
        int time = scanner.nextInt();
        System.out.println();
        if (time >= 10 && time <= 19) {
            System.out.print("We open. Welcome!");
        } else if ((time >= 0 && time < 10) || (time > 19 && time <= 24)) {
            System.out.print("We closed. Try visit this shop tomorrow!");
        } else {
            System.out.print("Input error.");
        }
    }
}
