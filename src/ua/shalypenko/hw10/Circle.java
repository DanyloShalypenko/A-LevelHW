package ua.shalypenko.hw10;

class Circle extends ua.shalypenko.hw10.Figure {
    private final double radius;

    public Circle(double radius) throws InvalidParameterException {
        if (radius <= 0) {
            throw new InvalidParameterException("Radius  must be a positive value." );
        }
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
