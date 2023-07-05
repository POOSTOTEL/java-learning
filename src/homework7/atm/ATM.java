package homework7.atm;

public class ATM {
    private int twenty;
    private int fifty;
    private int oneHundred;
    private void setFifty(int fifty) {
        this.fifty = fifty;
    }

    private void setOneHundred(int oneHundred) {
        this.oneHundred = oneHundred;
    }

    private void setTwenty(int twenty) {
        this.twenty = twenty;
    }

    public int getFifty() {
        return fifty;
    }

    public int getTwenty() {
        return twenty;
    }

    public int getOneHundred() {
        return oneHundred;
    }
    public void debit (int twenty, int fifty, int oneHundred) {
        int sum = 0;
        setTwenty(getTwenty() + twenty);
        setFifty(getFifty() + fifty);
        setOneHundred(getOneHundred() + oneHundred);
        sum = sum + getTwenty() * 20 + getFifty() * 50 + getOneHundred() * 100;
        System.out.println("Total balance: " + sum);
    }
    public boolean credit (int sum) {
        int banknote100 = oneHundred;
        int banknote50 = fifty;
        int banknote20 = twenty;
        boolean success = false;
        while (banknote100 != 0 && sum >= 100) {
            banknote100--;
            sum -= 100;
        }
        while (banknote50 != 0 && sum >= 50) {
            banknote50--;
            sum -= 50;
        }
        while (banknote20 != 0 && sum >= 20) {
            banknote20--;
            sum -= 20;
        }
        if (sum == 0) {
            success = true;
            setOneHundred(banknote100);
            setFifty(banknote50);
            setTwenty(banknote50);
        } else {
            System.out.println("Error transaction!");
        }
        sum = sum + getTwenty() * 20 + getFifty() * 50 + getOneHundred() * 100;
        System.out.println("Total balance: " + sum);
        return success;
    }
}
