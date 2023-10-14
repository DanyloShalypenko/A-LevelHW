package ua.shalypenko.hw5;

public class Task1 {
    public static void main(String[] args) {
        int numRows = 4;
        int numCols = 3;

        int[][] originalArray = createArray(numRows, numCols);

        int[][] modifiedArray = copyArray(originalArray);

        replaceEverySecondRowWithNegatives(modifiedArray);

        System.out.println("Исходный массив:");
        printArray(originalArray);

        System.out.println("Модифицированный массив:");
        printArray(modifiedArray);
    }

    public static int[][] createArray(int numRows, int numCols) {
        int[][] originalArray = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                originalArray[i][j] = i * numCols + j + 1;
            }
        }
        return originalArray;
    }

    // Метод для копирования массива
    public static int[][] copyArray(int[][] sourceArray) {
        int numRows = sourceArray.length;
        int numCols = sourceArray[0].length;
        int[][] copyArray = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                copyArray[i][j] = sourceArray[i][j];
            }
        }
        return copyArray;
    }


    public static void replaceEverySecondRowWithNegatives(int[][] array) {
        for (int i = 1; i < array.length; i += 2) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = -array[i][j];
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}