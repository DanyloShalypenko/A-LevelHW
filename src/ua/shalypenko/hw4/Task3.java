package ua.shalypenko.hw4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int size = 2000;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }

        int[] modifiedArray = replaceEvenWithZeros(array);

        System.out.println("Массив случайных чисел с четными значениями замененными на нули:");
        for (int j : modifiedArray) {
            System.out.print(j + " ");
        }
    }

    public static int[] replaceEvenWithZeros(int[] array) {
        int[] modifiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            modifiedArray[i] = (array[i] % 2 == 0) ? 0 : array[i];
        }
        return modifiedArray;
    }
}