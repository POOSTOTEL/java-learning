package lesson8.documentTracker;

public class SupplyContract extends Contract {
    private String type;
    private int amount;

    @Override
    public String toString() {
        return super.toString() + this.type + " " + this.amount;
    }
}
