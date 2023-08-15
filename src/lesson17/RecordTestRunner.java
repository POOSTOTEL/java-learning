package lesson17;

public class RecordTestRunner {
    public static void main(String[] args) {
        Person person1 = new Person("Tolia", 12);
        Person person2 = new Person("Sergei", 32);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.compareTo(person2));
    }
}
