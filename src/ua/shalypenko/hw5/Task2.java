package ua.shalypenko.hw5;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {10, 8, 5, 3, 2, 1};

        System.out.println("Массив:");
        printArray(array);

        boolean isDescending = isDescendingOrder(array);

        if (isDescending) {
            System.out.println("Массив упорядочен по убыванию.");
        } else {
            System.out.println("Массив не упорядочен по убыванию.");
        }
    }

    public static boolean isDescendingOrder(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}