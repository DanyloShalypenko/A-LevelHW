package ua.shalypenko.hw4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int size = 1000;

        int[] array = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }

        System.out.println("Количество простых чисел в массиве: " + primeCount(array));
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static int primeCount(int[] array)
    {
    int primeCount = 0;
        for (int num : array) {
            if (checkPrime(num)) {
                primeCount++;
            }
        }
        return primeCount;
    }
}