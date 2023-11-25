package ua.shalypenko.hw13;
import java.util.ArrayList;
import java.util.List;

public class TwiceBigger {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(5.0));
        figures.add(new Square(4.0));
        figures.add(new Triangle(4.0, 5.0, 6.0));

        findFiguresWithAreaTwicePerimeter(figures);
    }

    private static void findFiguresWithAreaTwicePerimeter(List<Figure> figures) {
        figures.stream()
                .filter(figure -> figure.area() >= 2 * figure.perimeter())
                .forEach(figure -> System.out.println(figure.getClass().getSimpleName()));
    }
}
