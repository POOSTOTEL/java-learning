package lesson8.documentTracker;

import java.util.Date;

public abstract class Contract {
    private int documentNumber;
    private Date date;

    public Contract() {
    }

    public Contract(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Contract(int documentNumber, Date date) {
        this(documentNumber);
        this.date = date;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return this.documentNumber + " " + this.date.toString() + " ";
    }
}
