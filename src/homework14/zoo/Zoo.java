package homework14.zoo;

import java.util.ArrayDeque;

public class Zoo {
    private ArrayDeque<Animal> animals = new ArrayDeque<>();

    public void addAnimal(Animal animal) {
        if (animals.isEmpty()) {
            animals.add(animal);
        } else {
            animals.addFirst(animal);
        }
    }

    public boolean removeAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Queue is empty!");
            return false;
        } else {
            animals.removeLast();
            return true;
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals.toString() +
                '}';
    }
}
