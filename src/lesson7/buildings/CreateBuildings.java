package lesson7.buildings;

import lesson7.buildings.model.Garage;
import lesson7.buildings.model.House;

public class CreateBuildings {
    public static void main(String[] args) {
        House house = new House();
        Garage garage = new Garage();
        System.out.println("House type: " + house.getType());
        System.out.println("Garage type: " + garage.getType());
    }
}
