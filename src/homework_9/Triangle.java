package homework_9;

public class Triangle extends Figure{
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double sperimeter = calculatePerimeter() / 2;
        double area = Math.sqrt(sperimeter * (sperimeter - sideA) * (sperimeter - sideB)
                * (sperimeter - sideC));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeterTriangle = this.sideA + this.sideB + this.sideC;
        return perimeterTriangle;
    }
}
