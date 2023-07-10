package homework8.figures;

public class Circle extends Figure implements Area {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Area.pi * Math.pow(radius, 2);
    }
}
