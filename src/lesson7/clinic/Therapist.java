package lesson7.clinic;

public class Therapist extends Doctor{
    protected Therapist() {
        super("Therapist", 3);
    }
    public void heal() {
        System.out.println("Work with therapy.");
    }
}
