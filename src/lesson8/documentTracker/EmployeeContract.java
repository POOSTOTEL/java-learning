package lesson8.documentTracker;

public class EmployeeContract extends Contract {
    private String expirationDate;
    private String name;

    public EmployeeContract() {

    }

    public EmployeeContract(int documentNumber, String date, String expirationDate, String name) {
        super(documentNumber, date);
        this.expirationDate = expirationDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + this.expirationDate.toString() + " " + this.name;
    }
}
