package lesson9.fruitShop.model;

public class Pear extends Fruit {
    private double cost;

    public Pear(double weight, double cost) {
        super(weight);
        this.cost = cost;
    }

    @Override
    public double getFruitCost() {
        return calculateCostByWeight(cost);
    }
}
