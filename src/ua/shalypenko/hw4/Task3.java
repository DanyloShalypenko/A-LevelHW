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
        nullMaker(array);
    }

    public static void nullMaker(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        System.out.println("Массив случайных чисел с четными значениями замененными на нули:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
/*public static int[] replaceEvenWithZeros(int[] array){
        int[] modifiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            modifiedArray[i] = (array[i] % 2 == 0) ? 0 : array[i];
        }
        return modifiedArray;
    }*/