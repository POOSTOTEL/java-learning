package homework8.figures;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Triangle", 2.12, 3.48);
        Square square = new Square("Square", 3);
        Rectangle rectangle = new Rectangle("Rectangle", 12, 15);
        Circle circle = new Circle("Circle", 4);
        System.out.println(triangle.calculateArea());
        System.out.println(square.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculateArea());

    }
}
