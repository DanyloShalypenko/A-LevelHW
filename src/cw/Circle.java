package cw;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class ain {
    public static void main(String[] args) {
        double radius = 0; // Ось радіус, який ви хочете перевірити

        if (radius <= 0) {
            System.err.println("Помилка: Недійсний радіус: " + radius);
        } else {
            Circle circle = new Circle(radius);
            double area = circle.getArea();
            System.out.println("Площа кола: " + area);
        }
    }
}