package homework_9.Task_2;

public class Rectangle extends Figure {

    private final double width;
    private final double height;
    //private final String figure = "Rectangle";

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.width * this.height);

    }

    @Override
    public String getFigure() {
        return "Rectangle";
    }
}
