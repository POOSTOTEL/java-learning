package lesson7.persons;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Igor";
        person.age = 102;
        System.out.println(person.name + " " + person.age + " " + person.getGender());
        Person person1 = new Person("Ilya", 5, 'C');
        System.out.println(person1.toString());
    }
}
