package cw;

public class cw2 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 4, 7, 3, 6};

        int maxIndex = findMaxIndex(array);
        int minIndex = findMinIndex(array);

        System.out.println("Индекс максимального элемента: " + maxIndex);
        System.out.println("Индекс минимального элемента: " + minIndex);
    }

    public static int findMaxIndex(int[] array) {
        int maxIndex = 0;
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static int findMinIndex(int[] array) {
        int minIndex = 0;
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
