package homework6;

public class CreditCardHolder {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(213234141, 123.6);
        CreditCard card2 = new CreditCard(123141412,12342.13);
        CreditCard card3 = new CreditCard(945465489, 936.32);
        card1.fill(123.99);
        card2.fill(12.3);
        card3.debit(301.12);
        card1.print();
        card2.print();
        card3.print();
    }
}
