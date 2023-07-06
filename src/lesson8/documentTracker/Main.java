package lesson8.documentTracker;

public class Main {
    public static void main(String[] args) {
        int maxNumberOfContracts = 3;
        Register register = new Register(maxNumberOfContracts);
        EmployeeContract employeeContract = new EmployeeContract(12, "12 september", "18 december", "Nikita");
        FinanceEnvoice financeEnvoice = new FinanceEnvoice(11, "15 october", 124.32, 322);
        SupplyContract supplyContract = new SupplyContract(3, "30 may", "table", 20);
        register.saveDocument(employeeContract);
        register.saveDocument(financeEnvoice);
        register.saveDocument(supplyContract);
        for (int i = 0; i < maxNumberOfContracts; i++) {
            register.getInfo(i);
        }
    }
}
