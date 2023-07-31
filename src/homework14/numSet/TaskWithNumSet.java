package homework14.numSet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TaskWithNumSet {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var file = new File("src\\homework14\\numSet\\input.txt");
        var set = new HashSet<Integer>();
        try (var fr = new FileReader(file);
             var reader = new BufferedReader(fr)) {
            var pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(reader.readLine());
            while (matcher.find()) {
                set.add(Integer.parseInt(matcher.group()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден или не создан.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла.");
        }
        System.out.print(set);
    }

    //Решение гениального Ростика
    public static void main2(String[] args) throws IOException {
        var file = new File("C:\\Users\\Lenovo\\IdeaProjects\\TeachMeSkills\\src\\homework14\\numSet\\input.txt");
        var input = Files.readString(file.toPath());

        Set<Integer> set = null;
        try {
            set = Arrays.stream(input.split(","))
                    .map(String::strip)
                    .map(Integer::parseInt)
                    .collect(Collectors.toSet());
        } catch (NumberFormatException e) {
            System.out.println("Error.");
        }

        System.out.println(set);
    }

}
