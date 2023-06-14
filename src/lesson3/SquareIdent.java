package lesson3;

import java.util.Scanner;

public class SquareIdent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ЗДЕСЬ МОГЛА БЫТЬ ВАЩА РЕКЛАМА
        int [] a = new int [4];
        while (true) {
            for (int i = 0; i < a.length; i++) {
                System.out.println("Insert the length of the side of the quadrilateral: ");
                a[i] = scanner.nextInt();
            }
            if (a[0] == a[2] && a[1] == a[3]) {
                if (a[0] == a[1] && a[0] == a[3]) {
                    System.out.print("It's square!");
                } else {
                    System.out.print("It's parallelogram!");
                }
            } else {
                System.out.print("It's quadrilateral!");
            }
            System.out.println("Do you want to continue? Y/N");
            if (scanner.next().toLowerCase().equals("n")) {
                break;
            }
        }
    }
}
