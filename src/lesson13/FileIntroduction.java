package lesson13;

import java.io.File;
import java.io.IOException;

public class FileIntroduction {
    public static void main(String[] args) {
        File file1 = createFile("temp.txt");
        if (!file1.exists()) {
            file1.delete();
        }
        File file2 = createFile("C:\\Users\\Lenovo\\IdeaProjects\\TeachMeSkills\\src\\temp2.txt");
        if (!file2.exists()) {
            file2.delete();
        }
    }

    private static File createFile(String name) {
        File file = new File(name);
        if (!file.exists()) {
            try {
                boolean isCreated = file.createNewFile();
                System.out.println("File was created: " + isCreated);
            } catch (IOException e) {
                System.out.println("File was not created.");
                return null;
            }
        }
        System.out.println("Parent: " + file.getParentFile());
        System.out.println("Exists: " + file.exists());
        System.out.println("File: " + file.isAbsolute());
        System.out.println("Directory: " + file.isDirectory());
        file.delete();
        return file;
    }
}
