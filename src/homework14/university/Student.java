package homework14.university;

public class Student {
    private String name;
    private int group;
    protected int course;
    private double averageValue;

    public Student(String name, int group, int course, double averageValue) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.averageValue = averageValue;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageValue() {
        return averageValue;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", averageValue=" + averageValue +
                '}';
    }
}
