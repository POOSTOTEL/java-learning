package semester2homework1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonRunner {
    //Input example:
    /*
    Jack,Ward,male,16
    Alex,Wilson,male,29
    Monica,Lopez,female,33
    Andrew,Warner,male,19
    Anton,Waphphel,male,21
     */
    //Output example:
    /*
    Alex,Wilson,male,29
    Andrew,Warner,male,19
    Anton,Waphphel,male,21
    Jack,Ward,male,16
    Monica,Lopez,female,33
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path;
        System.out.println("Please, write path to input file:");
        System.out.println("Example: C:/SomeDir");
        //Path to file in my PC ---> C:/Users/Lenovo/IdeaProjects/TeachMeSkills/src/semester2homework1/resources/input.txt
        path = scanner.nextLine();
        File personsFile = new File(path);
        ArrayList<Person> personList = new ArrayList<Person>();
        try (FileReader fr = new FileReader(personsFile); Scanner scan = new Scanner(fr)) {
            while (scan.hasNextLine()) {
                personList.add(buildPerson(scan.nextLine()));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stream<Person> stream = personList.stream();
        personList = (ArrayList<Person>) stream.sorted(Comparator.comparing(Person::getName).thenComparing((Person::getLastname))).collect(Collectors.toList());
        try (FileWriter fw = new FileWriter(personsFile, false)) {
            for (Person person : personList) {
                try {
                    fw.write(person.getName() + "," + person.getLastname() + "," + person.getGender() + "," + person.getAge() + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Person buildPerson(String line) {
        String[] wordArray = line.split(",");
        return new Person(wordArray[0], wordArray[1], wordArray[2], Integer.parseInt(wordArray[3]));
    }
}
