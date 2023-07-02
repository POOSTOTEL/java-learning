package homework7.atm;

import java.util.Scanner;

public class TellerMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        boolean work = true;
        while (work) {
            System.out.println("Select a menu item:");
            System.out.println("1. Debit;");
            System.out.println("2. Credit;");
            System.out.println("3. Exit.");
            switch (scanner.nextInt()) {
                case 1: {
                    System.out.println("Insert banknotes into the ATM:");
                    System.out.println("1. 20BYN");
                    System.out.println("2. 50BYN");
                    System.out.println("3. 100BYM");
                    atm.debit(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    break;
                }
                case 2: {
                    System.out.println("Input credit sum: ");
                    System.out.println("Transaction if " + atm.credit(scanner.nextInt()));
                    break;
                }
                case 3: {
                    System.out.println("Finish ATM work.");
                    work = false;
                    break;
                }
                default: {
                    System.out.println("Extreme exit.");
                }
            }
        }
    }
}
