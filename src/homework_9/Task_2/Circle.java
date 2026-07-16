package homework_9.Task_2;

public class Circle extends Figure {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;

    }
    @Override
    public String getFigure() {
        return "Circle";
    }
}
