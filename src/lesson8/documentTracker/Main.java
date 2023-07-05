package lesson8.documentTracker;

public class Main {
    public static void main(String[] args) {
        Registr registr = new Registr();
        //todo
        EmployeeContract employeeContract = new EmployeeContract(12, 1209, 18.12, "Nikita");
        FinanceEnvoice financeEnvoice = new FinanceEnvoice();
        SupplyContract supplyContract = new SupplyContract();
        registr.saveDocument();
    }
}
