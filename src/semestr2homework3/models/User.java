package semestr2homework3.models;

public class User implements Cloneable {
    private int id;
    private Pet pet;

    public User(int id, String name) {
        this.id = id;
        this.pet = new Pet(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "id=" + id + ", pet=" + pet.getName();
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public User deepClone() throws CloneNotSupportedException {
        User newUser = (User) super.clone();
        Pet pet = this.getPet().clone();
        newUser.setPet(pet);
        return newUser;
    }
}
