package homework14.zoo;

public class ZooRunner {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Lion");
        Animal animal2 = new Animal("Turtle");
        Animal animal3 = new Animal("Dolphin");
        Animal animal4 = new Animal("Penguin");
        Animal animal5 = new Animal("Tiger");
        Zoo zoo = new Zoo();
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        zoo.addAnimal(animal3);
        zoo.removeAnimal();
        zoo.addAnimal(animal4);
        zoo.addAnimal(animal5);
        zoo.removeAnimal();
        System.out.println(zoo.toString());
    }
}
