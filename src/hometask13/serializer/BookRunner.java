package hometask13.serializer;

import java.io.*;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book("Bible", "Jisus", "Hristos", 1245);
        Author author = book.getAuthor();
        String filename = "src\\hometask13\\serializer\\text.txt";
        BookSerializer(book, filename);
        System.out.println(book.toString());
        System.out.println(BookDeserializer(filename).toString());
    }

    private static void BookSerializer(Book book, String filename) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            objectOutputStream.writeObject(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Book BookDeserializer(String filename) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (Book) objectInputStream.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
