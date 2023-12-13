package ua.shalypenko.hw10;

class Triangle extends ua.shalypenko.hw10.Figure {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) throws InvalidParameterException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || !isValidTriangle(side1, side2, side3)) {
            throw new InvalidParameterException("Invalid triangle sides. ");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && b + c > a && c + a > b;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
