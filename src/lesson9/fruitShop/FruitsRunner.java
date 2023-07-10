package lesson9.fruitShop;

import lesson9.fruitShop.model.Apple;
import lesson9.fruitShop.model.Apricot;
import lesson9.fruitShop.model.Fruit;
import lesson9.fruitShop.model.Pear;

public class FruitsRunner {
    public static void main(String[] args) {
        Apple apple1 = new Apple(3, 1.5);
        Apricot apricot = new Apricot(2.5, 5);
        Pear pear = new Pear(3, 6.2);
        Apple apple2 = new Apple(2, 3);
        Fruit[] fruitBasket = {apple1, apricot, pear, apple2};
        double totalCost = 0;
        for (Fruit fruit : fruitBasket) {
            totalCost += fruit.getFruitCost();
        }
        System.out.println("Total cost fruit basket: " + totalCost);
    }
}
