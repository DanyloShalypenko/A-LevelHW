package ua.shalypenko.hw9;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Circle - Perimeter: " + circle.perimeter() + ", Area: " + circle.area());
        System.out.println("Square - Perimeter: " + square.perimeter() + ", Area: " + square.area());
        System.out.println("Triangle - Perimeter:  " + triangle.perimeter());
        System.out.println("Triangle - Area (Heron's formula): " + triangle.area());
        System.out.println("Triangle - Area (Product of two sides per sine angle): " + triangle.area(90));
        System.out.println("Triangle - Area (Base and Height product): " + triangle.area(4, 3));
    }
}
