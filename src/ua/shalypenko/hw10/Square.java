package ua.shalypenko.hw10;

class Square extends ua.shalypenko.hw10.Figure {
    private final double side;

    public Square(double side) throws InvalidParameterException {
        if (side <= 0) {
            throw new InvalidParameterException("Side length must be a positive value.");
        }
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
