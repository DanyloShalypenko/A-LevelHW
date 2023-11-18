package cw;

import java.util.ArrayList;

public class ArrayMerger {
    public static <T> ArrayList<T> mergeArrays(T[] arr1, T[] arr2) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (T item : arr1) {
            arrayList.add(item);
        }
        for (T item : arr2) {
            arrayList.add(item);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        String[] stringArray = {"a", "b", "c"};
        Integer[] intArray = {1, 2, 3};

        ArrayList<Object> mergedArray = mergeArrays(stringArray, intArray);

        System.out.println(mergedArray);
    }
}