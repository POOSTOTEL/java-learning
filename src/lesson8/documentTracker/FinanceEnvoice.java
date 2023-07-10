package lesson8.documentTracker;

public class FinanceEnvoice extends Contract {
    private double monthlyTotal;
    private int departmentCode;

    public FinanceEnvoice() {

    }

    public FinanceEnvoice(int documentNumber, String date, double monthlyTotal, int departmentCode) {
        super(documentNumber, date);
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return super.toString() + this.monthlyTotal + " " + this.departmentCode;
    }
}
