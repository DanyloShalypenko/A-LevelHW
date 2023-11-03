package ua.shalypenko.hw9;

import java.lang.Math;

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

    public Circle(double radius) {
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

    public Square(double side) {
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


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    // Area of triangle using Heron's formula
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Area of triangle using the product of two sides per sine angle
    public double area(double angle) {
        double angleInRadians = Math.toRadians(angle);
        return 0.5 * side1 * side2 * Math.sin(angleInRadians);
    }

    // Area using a base height product
    public double area(double base, double height) {
        return 0.5 * base * height;
    }
}

