package ua.shalypenko.hw5;

public class Task1 {
    public static void main(String[] args) {
        int numRows = 4;
        int numCols = 3;

        int[][] originalArray = createArray(numRows, numCols);

        fillArray(originalArray);

        System.out.println("Исходный массив:");
        printArray(originalArray);

        System.out.println("Модифицированный массив:");
        printArray(fillArray(originalArray));
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

    public static int[][] fillArray(int[][] sourceArray) {
        int numRows = sourceArray.length;
        int numCols = sourceArray[0].length;
        int[][] modifiedArray = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                modifiedArray[i][j] = sourceArray[i][j];
                if (i % 2 == 1) {
                    modifiedArray[i][j] = -modifiedArray[i][j];
                }
            }
        }

        return modifiedArray;
    }


    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}