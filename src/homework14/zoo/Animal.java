package homework14.zoo;

public class Animal {
    private String kind;

    public Animal(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return "kind='" + kind;
    }
}
