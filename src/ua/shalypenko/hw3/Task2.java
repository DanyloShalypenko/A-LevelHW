package ua.shalypenko.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите строку");
            String input = sc.nextLine();
            System.out.println("Вы ввели " + wordsCounter(input) + " слова");
        } while (true);
    }


    public static int wordsCounter(String input) {
        int counter = 0;
        if (!input.isEmpty()) {
            counter++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ' && i < input.length() - 1 && input.charAt(i + 1) != ' ') {
                    counter++;
                }
            }
            if (input.charAt(0) == ' ') {
                counter--;
            }
        }
        return counter;
    }
}