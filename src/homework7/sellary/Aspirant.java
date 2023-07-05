package homework7.sellary;

public class Aspirant extends Student{
    public boolean scienceWork;
    public Aspirant (String firstName, String lastName, int group, double averageMark, boolean scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }
    public boolean getScienceWork () {
        return this.scienceWork;
    }
    public void setScienceWork (boolean scienceWork) {
        this.scienceWork = scienceWork;
    }
    public int scholarship () {
        if (super.averageMark >= 5) {
            return super.scholarship() * 2;
        } else {
            return 10;
        }
    }
    public void print () {
        System.out.println("Aspirant: ");
        System.out.println("Firstname: " + super.getFirstName());
        System.out.println("Lastname: " + super.getLastName());
        System.out.println("Group number " + super.getGroup());
        System.out.println("Average mark: " + super.averageMark);
        System.out.println("This aspirant has science work: " + this.scienceWork);
        System.out.println();
    }
}
