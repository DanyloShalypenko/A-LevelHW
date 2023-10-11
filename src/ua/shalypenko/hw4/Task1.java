package ua.shalypenko.hw4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int size = 400;

        int[] array = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        System.out.println("Среднее арифметическое: " + calculateArithmeticMean(array));
        System.out.println("Среднее геометрическое: " + calculateGeometricMean(array));
    }


    public static double calculateArithmeticMean(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double calculateGeometricMean(int[] array) {
        double product = 1.0;
        for (int value : array) {
            product *= value;
        }
        return Math.pow(product, 1.0 / array.length);
    }
}