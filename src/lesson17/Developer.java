package lesson17;

public class Developer {
    private long id;
    private String name;

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Developer(long id, String name) {
        this.id = id;
        this.name = name;

    }
}
