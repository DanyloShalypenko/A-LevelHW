package ua.shalypenko.hw12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FigureCompare {
    public static void main(String[] args) throws InvalidParameterException {
        // Створення об'єктів фігур
        Circle circle = new Circle(5);
        Square square = new Square(20);
        Triangle triangle = new Triangle(3, 4, 5);

        // Додавання фігур до списку
        List<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(square);
        figures.add(triangle);

        // Ланцюг компараторів
        Comparator<Figure> byArea = Comparator.comparing(Figure::area);
        Comparator<Figure> byPerimeter = Comparator.comparing(Figure::perimeter);
        Comparator<Figure> combinedComparator = byArea.thenComparing(byPerimeter);

        // Сортування фігур за площею та периметром
        figures.sort(combinedComparator);

        // Виведення відсортованих фігу
        for (Figure figure : figures) {
            System.out.println("Area: " + figure.area() + ", Perimeter: " + figure.perimeter());
        }
    }
}