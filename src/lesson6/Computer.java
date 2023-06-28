package lesson6;

import java.util.Scanner;

public class Computer {
    double coast;
    String model;
    RAM ram = new RAM();
    HDD hdd = new HDD();
    public Computer () {
        System.out.println("Base constructor.");
        coast = 0.0;
        model = "unknown";
    }
    public Computer (double coast, String model) {
        System.out.println("First constructor.");
        this.coast = coast;
        this.model = model;
    }
    public Computer (double coast, String model, RAM ram, HDD hdd) {
        System.out.println("Second constructor.");
        this.coast = coast;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }
    public void print () {
        System.out.println(coast + " "
                + model + " "
                + hdd.name + " "
                + hdd.size + " "
                + hdd.internal + " "
                + ram.name + " "
                + ram.size);
    }
}
