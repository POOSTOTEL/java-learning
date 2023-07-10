package homework8.figures;

public class Triangle extends Figure implements Area {
    private double side;
    private double height;

    public Triangle(String name, double side, double height) {
        super(name);
        this.side = side;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.height / 2;
    }
}
