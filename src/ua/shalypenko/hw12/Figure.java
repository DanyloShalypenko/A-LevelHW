package ua.shalypenko.hw12;

class InvalidParameterException extends Exception {
    public InvalidParameterException(String message) {
        super(message);
    }
}

class Figure {
    public double perimeter() {
        return 0.0;
    }

    public double area() {
        return 0.0;
    }
}

class Circle extends Figure {
    private final double radius;

    public Circle(double radius) throws InvalidParameterException {
        if (radius <= 0) {
            throw new InvalidParameterException("Radius must be a positive value.");
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

class Square extends Figure {
    private final double side;

    public Square(double side) throws InvalidParameterException {
        if (side <= 0) {
            throw new InvalidParameterException("Side length must be a positive value");
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

class Triangle extends Figure {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) throws InvalidParameterException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || !isValidTriangle(side1, side2, side3)) {
            throw new InvalidParameterException("Invalid triangle sides.");
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
