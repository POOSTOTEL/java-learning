package hometask13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JokeReader {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\Lenovo\\IdeaProjects\\TeachMeSkills\\src\\hometask13\\joke.txt"));
        String longestWord = "";
        String analyzedWord;
        while (scanner.hasNext()) {
            analyzedWord = scanner.next();
            analyzedWord = analyzedWord.replace('-', ' ').replace(',', ' ');
            analyzedWord = analyzedWord.replace('.', ' ').replace('?', ' ');
            analyzedWord = analyzedWord.replace('!', ' ').trim();
            if (analyzedWord.length() > longestWord.length()) {
                longestWord = analyzedWord;
            }
        }
        try (FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\TeachMeSkills\\src\\hometask13\\longest-word.txt")) {
            fw.write(longestWord);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
