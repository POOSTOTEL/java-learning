package Homework1;

import java.util.Scanner;

public class Task1and2and3 {
    public static void main(String[] args) {
        //Подключение сканера для считывания данных пользователя
        Scanner scanner = new Scanner(System.in);
        //Объявление и стартовая инициализация переменных
        String name = "";
        boolean hasDriverLicense = false;
        char categoryLicense = ' ';
        int carSerialNumber = 0;
        String carBrand = "";
        float servicePrice = 0;
        //Вывод инициализированных данных
        System.out.println("Driver's name: " + name);
        System.out.println("The driver has a license: " + hasDriverLicense);
        System.out.println("Driving license category: " + categoryLicense);
        System.out.println("Car serial number: " + carSerialNumber);
        System.out.println("Car brand: " + carBrand);
        System.out.println("Price: " + servicePrice);
        System.out.print("\n");
        //Ввод пользовательских данных из консоли
        System.out.println("Input driver's name: ");
        name = scanner.nextLine();
        System.out.println("The driver has a license (example: \"true\" or \"false\"): ");
        hasDriverLicense = scanner.nextBoolean();
        System.out.println("License category: ");
        categoryLicense = scanner.next().charAt(0);
        System.out.println("Input car serial number: ");
        carSerialNumber = scanner.nextInt();
        System.out.println("Input car brand: ");
        carBrand = scanner.next();
        System.out.println("Input service price $/h: ");
        servicePrice = scanner.nextFloat();
        System.out.print("\n");
        //Вывод данных, введённых пользователем
        System.out.println("Driver's name: " + name);
        System.out.println("The driver has a license: " + hasDriverLicense);
        System.out.println("Driving license category: " + categoryLicense);
        System.out.println("Car serial number: " + carSerialNumber);
        System.out.println("Car brand: " + carBrand);
        System.out.println("Price: " + servicePrice);
    }
}
