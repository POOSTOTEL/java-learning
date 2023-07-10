package lesson8.documentTracker;

public interface WorkWithDocuments {
    public abstract boolean saveDocument(Contract contract);

    public abstract void getInfo(int pointer);
}
