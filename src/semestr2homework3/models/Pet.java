package semestr2homework3.models;

public class Pet implements Cloneable {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Pet clone() throws CloneNotSupportedException {
        return (Pet) super.clone();
    }
}
