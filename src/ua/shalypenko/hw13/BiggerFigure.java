package ua.shalypenko.hw13;

import java.util.ArrayList;
import java.util.List;

public class BiggerFigure {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(5.0));
        figures.add(new Square(4.0));
        figures.add(new Triangle(3.0, 4.0, 5.0));

        double difference = 12.0;

        findFiguresByArea(figures, difference);
    }

    private static void findFiguresByArea(List<Figure> figures, double difference) {
        figures.stream()
                .filter(figure -> figure.area() > difference)
                .forEach(figure -> System.out.println(figure.getClass().getSimpleName()));
    }
}
