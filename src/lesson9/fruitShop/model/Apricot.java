package lesson9.fruitShop.model;

public class Apricot extends Fruit {
    private double cost;

    public Apricot(double weight, double cost) {
        super(weight);
        this.cost = cost;
    }

    @Override
    public double getFruitCost() {
        return calculateCostByWeight(cost);
    }
}
