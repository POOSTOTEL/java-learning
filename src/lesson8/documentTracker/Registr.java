package lesson8.documentTracker;

public class Registr implements WorkWithDocuments {
    Contract contracts[];
    private int length = 10;

    public Registr() {
    }

    @Override
    public boolean saveDocument(Contract contract) {
        if (length > 0) {
            contracts[contracts.length - 1] = contract;
            this.length--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void getInfo(int pointer) {
        contracts[pointer].toString();
    }
}
