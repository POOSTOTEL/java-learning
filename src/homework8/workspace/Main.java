package homework8.workspace;

public class Main {
    public static void main(String[] args) {
        Director dir = new Director();
        Financier fin = new Financier();
        Worker worker = new Worker();
        dir.print();
        fin.print();
        worker.print();
    }
}
