package ua.shalypenko.hw2;

public class Task1 {
    public static void main(String[] args) {
        double  x1 = 1.0, x2 = 3.0, x3 = 6.0;
        double y1 = 5.0, y2 = 5.0, y3 = 7.0;

        double square = calculateSquare(x1, y1, x2, y2, x3, y3);
            System.out.println("Площадь: " + square);
        }


    public static double calculateSquare(double x1, double y1, double x2, double y2, double x3, double y3) {

        return Math.abs((x1 - x3)*(y2 - y3) - (x2 - x3)*(y1 - y3)/2);
        }
    }
