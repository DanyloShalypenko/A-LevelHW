package shalypenko_hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите строку");
            String input = sc.nextLine();
            System.out.println("Вы ввели " + WordsCounter(input) + " слова");
        } while (true);
    }


    public static int WordsCounter(String input) {
        int counter = 0;
        if (!input.isEmpty()) {
            counter++;
            for (int i = 0; i < input.length() - 1; i++) {
                if (input.charAt(i) == ' ') {
                    counter++;
                }
            }
        }
        return counter;
    }
}

