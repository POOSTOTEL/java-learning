package lesson13.task2FileReaderAndWriter;

import java.io.*;

public class FileReaderWriterIntroduction {
    private static final String LINE = "Congnosce te ipsum";

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("temp.txt")) {
            fw.write(LINE);
        } catch (IOException e) {
            System.out.println("Error!");
        }
        try (FileReader fr = new FileReader("temp.txt")) {
            int letter = 0, previousLetter = 0;
            boolean isFirst = true;
            while ((letter = fr.read()) != -1) {
                if (isFirst) {
                    System.out.print((char) letter);
                    isFirst = false;
                }
                previousLetter = letter;
            }
            System.out.print((char) previousLetter);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File");
        }
        File f = new File("tms2.txt");
        char[] mass = new char[(int) f.length()];
    }
}
