package ua.shalypenko.hw5;

public class Task3 {
    public static void main(String[] args) {
        int[][] originalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transposedArray = transposeArray(originalArray);

        System.out.println("Исходный массив:");
        printArray(originalArray);

        System.out.println("Массив после обмена строк и столбцов:");
        printArray(transposedArray);
    }

    public static int[][] transposeArray(int[][] array) {
        int numRows = array.length;
        int numCols = array[0].length;
        int[][] transposedArray = new int[numCols][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }

        return transposedArray;
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