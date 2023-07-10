package lesson9.fruitShop.model;

public class Apple extends Fruit {
    private double cost;

    public Apple(double weight, double cost) {
        super(weight);
        this.cost = cost;
    }

    @Override
    public double getFruitCost() {
        return calculateCostByWeight(cost);
    }
}
