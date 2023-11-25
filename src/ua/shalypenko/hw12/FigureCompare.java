package ua.shalypenko.hw12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class FigureCompare {
    public static void main(String[] args) throws InvalidParameterException {
        Circle circle = new Circle(5);
        Square square = new Square(20);
        Triangle triangle = new Triangle(3, 4, 5);

        List<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(square);
        figures.add(triangle);

        Comparator<Figure> byArea = Comparator.comparing(Figure::area);
        Comparator<Figure> byPerimeter = Comparator.comparing(Figure::perimeter);
        Comparator<Figure> combinedComparator = byArea.thenComparing(byPerimeter);

        figures.sort(combinedComparator);

        for (Figure figure : figures) {
            System.out.println("Area: " + figure.area() + ", Perimeter:  " + figure.perimeter());
        }
    }
}