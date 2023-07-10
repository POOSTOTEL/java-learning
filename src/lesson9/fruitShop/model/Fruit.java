package lesson9.fruitShop.model;

public abstract class Fruit {
    public double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    protected double calculateCostByWeight(double cost) {
        return weight * cost;
    }

    public static void printManufacturerInfo() {
        System.out.println("Made in Ukraine");
    }

    public abstract double getFruitCost();
}
