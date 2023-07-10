package homework8.workspace;

public class Director implements Printer {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Director.");
    }
}
