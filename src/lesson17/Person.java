package lesson17;

public record Person(String name, int age) implements Comparable {
    @Override
    public int compareTo(Object o) {
        if (o instanceof Person person) {
            return age - person.age();
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
