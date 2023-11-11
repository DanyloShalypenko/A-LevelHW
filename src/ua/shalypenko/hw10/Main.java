package ua.shalypenko.hw10;

public class Main {
    public static void main(String[] args) {
        try {

            Circle circle = new Circle(5.0);
            System.out.println("Circle Perimeter: " + circle.perimeter());
            System.out.println("Circle Area: " + circle.area());

            Square square = new Square(4.0);
            System.out.println("Square Perimeter: " + square.perimeter());
            System.out.println("Square Area: " + square.area());

            Triangle triangle = new Triangle(1.0, 1.0, 3.0);
            System.out.println("Triangle Perimeter: " + triangle.perimeter());
            System.out.println("Triangle Area: " + triangle.area());


        } catch (InvalidParameterException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}