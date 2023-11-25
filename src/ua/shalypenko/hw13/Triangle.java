package ua.shalypenko.hw13;

class Triangle extends Figure {
    private final double side1;
    private final double side2;
    private final double side3;


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }


    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }


    public double area(double angle) {
        double angleInRadians = Math.toRadians(angle);
        return 0.5 * side1 * side2 * Math.sin(angleInRadians);
    }
}

