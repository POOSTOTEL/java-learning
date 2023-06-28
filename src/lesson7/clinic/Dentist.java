package lesson7.clinic;

public class Dentist extends Doctor{
    protected Dentist() {
        super("Dentist", 2);
    }
    public void heal() {
        System.out.println("Make new teeth.");
    }
}
