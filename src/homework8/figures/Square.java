package homework8.figures;

public class Square extends Figure implements Area {
    private double sideA;

    public double getSideA() {
        return sideA;
    }

    public Square(String name, double sideA) {
        super(name);
        this.sideA = sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.sideA, 2);
    }
}
