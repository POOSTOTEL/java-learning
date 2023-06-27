package homework6;

public class CreditCard {
    long checkNum;
    double  balance;
    public CreditCard() {
        checkNum = 0;
        balance = 0;
    }

    public CreditCard(int checkNum, double balance) {
        this.checkNum = checkNum;
        this.balance = balance;
    }

    void fill(double sum) {
        balance += sum;
    }
    void print() {
        System.out.println("Bank check number: " + checkNum + ", balance: " + balance + ";");
    }
    void debit(double sum) {
        balance -= sum;
    }
}