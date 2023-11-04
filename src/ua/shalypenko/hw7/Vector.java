package ua.shalypenko.hw7;

import java.util.Random;

public class Vector {
    private final double x;
    private final double y;
    private final double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector crossProduct(Vector otherVector) {
        double newX = y * otherVector.z - z * otherVector.y;
        double newY = z * otherVector.x - x * otherVector.z;
        double newZ = x * otherVector.y - y * otherVector.x;
        return new Vector(newX, newY, newZ);
    }

    public double cosineAngle(Vector otherVector) {
        double dotProduct = x * otherVector.x + y * otherVector.y + z * otherVector.z;
        double magnitudeProduct = length() * otherVector.length();
        if (magnitudeProduct == 0) {
            return Double.NaN;
        }
        return dotProduct / magnitudeProduct;
    }

    public Vector add(Vector otherVector) {
        double newX = x + otherVector.x;
        double newY = y + otherVector.y;
        double newZ = z + otherVector.z;
        return new Vector(newX, newY, newZ);
    }

    public Vector subtract(Vector otherVector) {
        double newX = x - otherVector.x;
        double newY = y - otherVector.y;
        double newZ = z - otherVector.z;
        return new Vector(newX, newY, newZ);
    }

    public static Vector[] randomVectors(int n) {
        Vector[] vectors = new Vector[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            double randomX = -1 + random.nextDouble() * 2;
            double randomY = -1 + random.nextDouble() * 2;
            double randomZ = -1 + random.nextDouble() * 2;
            vectors[i] = new Vector(randomX, randomY, randomZ);
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

