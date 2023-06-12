package Lesson1;

import java.util.Scanner;

public class Quest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input author: ");
        String author = scanner.nextLine();
        System.out.println("Input num of pages: ");
        int numberOfPages = scanner.nextInt();
        System.out.println("Input we has this book? ");
        boolean weHasThisBookInLibrary = scanner.nextBoolean();
        System.out.println("Input bukva for catalog: ");
        char firstBukvaInName = scanner.nextLine().charAt(1);
        System.out.println("Author " + author);
        System.out.println("Pages " + numberOfPages);
        System.out.println("We has this book " + weHasThisBookInLibrary);
        System.out.println("Catalog " + firstBukvaInName);

    }
}
