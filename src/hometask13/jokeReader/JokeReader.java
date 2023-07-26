package hometask13.jokeReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JokeReader {
    //Проверьте этот код, это первое задание, я зкоммитил его не в ту ветку, случайно.
    public static void main(String[] args) {
        String longestWord = "";
        String analyzedWord;
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Lenovo\\IdeaProjects\\TeachMeSkills\\src\\hometask13\\jokeReader\\joke.txt"));
            while (scanner.hasNext()) {
                analyzedWord = scanner.next();
                analyzedWord = analyzedWord.replace('-', ' ').replace(',', ' ');
                analyzedWord = analyzedWord.replace('.', ' ').replace('?', ' ');
                analyzedWord = analyzedWord.replace('!', ' ').trim();
                if (analyzedWord.length() > longestWord.length()) {
                    longestWord = analyzedWord;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\TeachMeSkills\\src\\hometask13\\jokeReader\\longest-word.txt")) {
            fw.write(longestWord);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
