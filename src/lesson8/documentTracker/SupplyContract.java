package lesson8.documentTracker;

public class SupplyContract extends Contract {
    private String type;
    private int amount;

    public SupplyContract() {

    }

    public SupplyContract(int documentNumber, String date, String type, int amount) {
        super(documentNumber, date);
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString() + this.type + " " + this.amount;
    }
}
