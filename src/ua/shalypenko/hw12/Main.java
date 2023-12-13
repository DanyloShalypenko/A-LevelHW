package ua.shalypenko.hw12;

public class Main {
    public static void main(String[] args) {
        Circle circle = null;
        Square square = null;
        Triangle triangle = null;
        try {

            circle = new Circle(5.0);
            System.out.println("Circle Perimeter: " + circle.perimeter());
            System.out.println("Circle Area: " + circle.area());

            square = new Square(4.0);
            System.out.println("Square Perimeter:  " + square.perimeter());
            System.out.println("Square Area: " + square.area());

            triangle = new Triangle(3.0, 4.0, 5.0);
            System.out.println("Triangle Perimeter: " + triangle.perimeter());
            System.out.println("Triangle Area: " + triangle.area());


        } catch (InvalidParameterException e) {
            System.out.println("Exception:  " + e.getMessage());
        }
        Figure largestFigure = findLargestArea(circle, square, triangle);

        if (largestFigure != null) {
            System.out.println("Figure with the Largest Area:  " + largestFigure.getClass().getSimpleName());
        }

    }
    private static Figure findLargestArea(Figure... figures) {
        if (figures.length == 0) {
            return null;
        }

        Figure largestFigure = figures[0];
        double largestArea = largestFigure.area();

        for (Figure figure : figures) {
            double area = figure.area();
            if (area > largestArea) {
                largestArea = area;
                largestFigure = figure;
            }
        }

        return largestFigure;
    }
}