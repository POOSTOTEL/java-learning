package lesson8.documentTracker;

public class FinanceEnvoice extends Contract {
    private int monthlyTotal;
    private int departmentCode;

    @Override
    public String toString() {
        return super.toString() + this.monthlyTotal + " " + this.departmentCode;
    }
}
