package hometask13.consoleValidator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File validLinesFile = new File("C:\\Users\\Lenovo\\IdeaProjects\\TeachMeSkills\\src\\hometask13\\consoleValidator\\validLines.txt");
        File invalidLinesFile = new File("C:\\Users\\Lenovo\\IdeaProjects\\TeachMeSkills\\src\\hometask13\\consoleValidator\\invalidLines.txt");
        boolean userWantContinueWork = true;
        while (userWantContinueWork) {
            System.out.println("Нажмите 1, если хотите продолжить или 0, если хотите завершить работу.");
            switch (scanner.nextLine().charAt(0)) {
                case 1 -> {
                    String line = scanner.nextLine();
                    String wrongSymbolsLine = "";
                    boolean incorrectInput = false;
                    Pattern pattern = Pattern.compile("\\W");
                    Matcher matcher = pattern.matcher(line);
                    while (matcher.find()) {
                        incorrectInput = true;
                        wrongSymbolsLine += matcher.group();
                    }
                    if (!incorrectInput) {
                        validInput(line, validLinesFile);
                    } else {
                        invalidInput(line, wrongSymbolsLine, invalidLinesFile);
                    }
                }
                case 0 -> userWantContinueWork = false;
            }
        }
    }

    private static void invalidInput(String inputLine, String errorSymbols, File path) {
        try (FileWriter fw = new FileWriter(path)) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void validInput(String line, File path) {

    }
}
