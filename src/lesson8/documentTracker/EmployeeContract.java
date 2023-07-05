package lesson8.documentTracker;

import java.util.Date;

public class EmployeeContract extends Contract {
    private Date expirationDate;
    private String name;

    public EmployeeContract(int documentNumber, Date date, Date expirationDate, String name) {
        super(documentNumber, date);
        this.expirationDate = expirationDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + this.expirationDate.toString() + " " + this.name;
    }
}
