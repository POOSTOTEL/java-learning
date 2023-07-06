package lesson8.documentTracker;

public class Register implements WorkWithDocuments {
    private int length;
    private Contract contracts[] = new Contract[length];

    public Register(int length) {
        this.length = length;
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
