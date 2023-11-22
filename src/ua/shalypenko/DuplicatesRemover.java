package ua.shalypenko;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicatesRemover {
    public static <T> List<T> removeDuplicates(List<T> list) {
        HashSet<T> uniqueSet = new HashSet<>(list);
        return new ArrayList<>(uniqueSet);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        System.out.println("List with duplicates: " + numbers);

        List<Integer> uniqueNumbers = removeDuplicates(numbers);

        System.out.println("List without duplicates: " + uniqueNumbers);
    }
}