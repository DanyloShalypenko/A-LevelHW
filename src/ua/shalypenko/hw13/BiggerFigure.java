package ua.shalypenko.hw13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BiggerFigure {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(5.0));
        figures.add(new Square(4.0));
        figures.add(new Triangle(3.0, 4.0, 5.0));

        double difference = 5.0;

        findFiguresByArea(figures, difference);
    }

    private static void findFiguresByArea(List<Figure> figures, double difference) {
        // Find the figure with the min area
        Figure minAreaFigure = figures.stream()
                .min(Comparator.comparing(Figure::area))
                .orElse(null);

        if (minAreaFigure != null) {
            System.out.println("Figure with min area: " + minAreaFigure.getClass().getSimpleName());
            double minArea = minAreaFigure.area();

            // Find all figures with area bigger than min one on the difference parameter
            figures.stream()
                    .filter(figure -> figure.area() > minArea + difference)
                    .forEach(figure -> System.out.println("Figure with area bigger than min " + figure.getClass().getSimpleName()));
        }
    }
}