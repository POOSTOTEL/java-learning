package lesson6;

import java.lang.constant.DynamicConstantDesc;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class ComputerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Print information about computers;");
        System.out.println("2. Add new computer with short info about it;");
        System.out.println("3. Add new computer with full info about it.");
        System.out.println("Write operation number: ");
        Computer computers[] = new Computer[10];
        int pcCounter = 0;
        while (pcCounter < computers.length) {
            switch (scanner.nextLine().charAt(0)) {
                case '1': {
                    for (int i = 0; i < pcCounter; i++) {
                        computers[i].print();
                    }
                    break;
                }
                case '2': {
                    System.out.println("Write cost:");
                    double cost = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Write name:");
                    String pcName = scanner.next();
                    Computer pc = new Computer(cost, pcName);
                    computers[pcCounter] = pc;
                    pcCounter++;
                    pc.print();
                    break;
                }
                case '3': {
                    System.out.println("Write cost:");
                    double cost = scanner.nextDouble();
                    System.out.println("Write name:");
                    String pcName = scanner.nextLine();
                    System.out.println("Write RAM vendor:");
                    String ramName = scanner.nextLine();
                    System.out.println("Write RAM size:");
                    double ramSize = scanner.nextDouble();
                    RAM ram = new RAM(ramName, ramSize);
                    System.out.println("Write HDD vendor:");
                    String hddName = scanner.nextLine();
                    System.out.println("Write HDD size:");
                    double hddSize = scanner.nextDouble();
                    System.out.println("HDD internal?");
                    boolean hddInternal = scanner.nextBoolean();
                    HDD hdd = new HDD(hddName, hddSize, hddInternal);
                    Computer pc = new Computer(cost, pcName, ram, hdd);
                    computers[pcCounter] = pc;
                    pcCounter++;
                    pc.print();
                    break;
                }
                default: {
                    System.out.println("Error input!!!");
                    return;
                }
            }
        }
    }
}
