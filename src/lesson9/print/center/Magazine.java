package lesson9.print.center;

public class Magazine implements Printable {
    private String magazineName;
    private String author;

    public Magazine(String magazineName, String author) {
        this.magazineName = magazineName;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Author: " + author + ", book name: " + magazineName);
    }
}
