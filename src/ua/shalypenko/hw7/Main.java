package ua.shalypenko.hw7;

public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);

        System.out.println("Vector 1: " + v1);
        System.out.println("Vector 2: " + v2);
        System.out.println("Length of Vector 1: " + v1.length());
        System.out.println("Cross Product of Vector 1 and Vector 2: " + v1.crossProduct(v2));
        System.out.println("Cosine Angle between Vector 1 and Vector 2: " + v1.cosineAngle(v2));
        System.out.println("Vector Sum: " + v1.add(v2));
        System.out.println("Vector Difference: " + v1.subtract(v2));

        Vector[] randomVectors = Vector.randomVectors(5);
        System.out.println("Random Vectors:");
        for (Vector vector : randomVectors) {
            System.out.println(vector);
        }
    }
}

