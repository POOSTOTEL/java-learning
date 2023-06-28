package lesson7.clinic;

public class Surgeon extends Doctor{
    protected Surgeon() {
        super("Surgeon", 1);
    }
    public void heal() {
        System.out.println("Repair bones.");
    }
}
