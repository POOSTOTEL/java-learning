package homework6;

import java.util.Scanner;

public class CreditCardHolderWithStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard card = new CreditCard();
        boolean correctInput = true;
        while (correctInput) {
            System.out.println("1. Check balance;");
            System.out.println("2. Fill money to balance;");
            System.out.println("3. Debit money;");
            System.out.println("Write operation number:");
            switch (scanner.nextInt()) {
                case 1: {
                    card.print();
                    break;
                }
                case 2: {
                    System.out.println("write sum for pull:");
                    card.fill(scanner.nextDouble());
                    break;
                }
                case 3: {
                    scanner.nextLine();
                    System.out.println("write sum for debit:");
                    card.debit(scanner.nextDouble());
                    break;
                }
                default: {
                    correctInput = false;
                    System.out.println("INCORRECT INPUT!!!");
                    ;
                }
            }
        }
    }
}
