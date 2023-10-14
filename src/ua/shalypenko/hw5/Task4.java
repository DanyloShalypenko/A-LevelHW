package ua.shalypenko.hw5;

public class Task4 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 1;

        int[] newArray = deleteElement(originalArray, k);

        System.out.println("Исходный массив:");
        printArray(originalArray);

        System.out.println("Массив после удаления элемента:");
        printArray(newArray);
    }

    public static int[] deleteElement(int[] array, int k) {
        int length = array.length;
        if (k < 0 || k >= length) {
            return array;
        }

        int[] newArray = createModifiedArray(array, k);

        return newArray;
    }

    public static int[] createModifiedArray(int[] array, int k) {
        int length = array.length;
        int[] newArray = new int[length - 1];
        int newArrayIndex = 0;

        for (int i = 0; i < length; i++) {
            if (i != k) {
                newArray[newArrayIndex] = array[i];
                newArrayIndex++;
            }
        }

        return newArray;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}