package semestr2homework3.services;

import semestr2homework3.models.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StartMenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("C:\\Users\\Lenovo\\IdeaProjects\\TeachMeSkills\\src\\semestr2homework3\\data\\data.txt");
        ArrayList<User> userList = new ArrayList<>();
        try (Scanner scan = new Scanner(new FileReader(file))) {
            while (scan.hasNext()) {
                userList.add(UserParser.parse(scan.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл с данными о Users не существует.");
        }
        while (true) {
            System.out.println("Меню.");
            System.out.println("1. Прочитать из файлах всех Users");
            System.out.println("2. Добавить нового User");
            System.out.println("3. Поверхностное клонирование");
            System.out.println("4. Глубокое клонирование");
            System.out.println("5. Выйти из программы");
            System.out.println("Введите номер пункта меню:");
            switch (scanner.nextLine()) {
                case "1" -> {
                    userList.forEach(System.out::println);
                }
                case "2" -> {
                    try (FileWriter fw = new FileWriter(file, true)) {
                        System.out.println("Введите id пользователя и кличку домашнего животного через запятую:");
                        System.out.println("Пример ввода: \"12, Добби\"");
                        String newUser = scanner.nextLine();
                        fw.write("\n" + newUser);
                        userList.add(UserParser.parse(newUser));
                    } catch (IOException e) {
                        System.out.println("Доступ к файлу нарушен.");
                    }
                }
                case "3" -> {
                    System.out.println("Введите id клонируемого User:");
                    int searchedId = Integer.parseInt(scanner.nextLine());
                    try {
                        User realUser = userList.stream().filter(user -> user.getId() == searchedId).findAny().get();
                        User clonedUser = realUser.clone();
                        System.out.println("Оригинальный User: " + realUser + " " + realUser.hashCode());
                        System.out.println("Клонированный User: " + clonedUser + " " + clonedUser.hashCode());
                        System.out.println("Оригинальный User equals клонированный User: " + realUser.equals(clonedUser));
                        System.out.println("Оригинальный User.pet equals клонированный User.pet: " + realUser.getPet().equals(clonedUser.getPet()));
                    } catch (CloneNotSupportedException e) {
                        System.out.println("Клонирование не поддерживается");
                    }
                }
                case "4" -> {
                    System.out.println("Введите id клонируемого User:");
                    int searchedId = Integer.parseInt(scanner.nextLine());
                    try {
                        User realUser = userList.stream().filter(user -> user.getId() == searchedId).findAny().get();
                        User clonedUser = realUser.deepClone();
                        System.out.println("Оригинальный User: " + realUser + " " + realUser.hashCode());
                        System.out.println("Глубоко клонированный User: " + clonedUser + " " + clonedUser.hashCode());
                        System.out.println("Оригинальный User equals глубоко клонированный User: " + realUser.equals(clonedUser));
                        System.out.println("Оригинальный User.pet equals глубоко клонированный User.pet: " + realUser.getPet().equals(clonedUser.getPet()));
                    } catch (CloneNotSupportedException e) {
                        System.out.println("Глубоко клонирование не поддерживается");
                    }
                }
                case "5" -> {
                    System.out.println("Программа завершена успешно!");
                    return;
                }
                default -> System.out.println("Некорректный ввод, попробуйте снова.");
            }
        }
    }

}
