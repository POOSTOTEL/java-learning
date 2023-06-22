package homework4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write line: ");
        char line[] = scanner.nextLine().toCharArray();
        for (int i = line.length - 1; i >= 0; i--) {
            System.out.print(line[i]);
        }
    }
}
