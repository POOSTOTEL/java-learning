package lesson8.documentTracker;

public abstract class Contract {
    private int documentNumber;
    private String date;

    public Contract() {
    }
    public Contract(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Contract(int documentNumber, String date) {
        this(documentNumber);
        this.date = date;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return this.documentNumber + " " + this.date.toString() + " ";
    }
}
