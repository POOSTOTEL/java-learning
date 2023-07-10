package lesson9.print;

import lesson9.print.center.Book;
import lesson9.print.center.Magazine;
import lesson9.print.center.Printable;

public class PrintRunner {
    public static void main(String[] args) {
        Printable[] literature = {
                new Book("One piece", "Pushkin"),
                new Magazine("Bezos", "PlayBoy")
        };
        for (Printable printable : literature) {
            printable.print();
        }
    }
}
