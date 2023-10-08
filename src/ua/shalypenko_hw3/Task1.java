package ua.shalypenko_hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите строку: ");
            String str = scanner.nextLine();
            checkPol(str);
        }
    }

    public static boolean checkPol(String par) {
        String delSpace = par.replace(" ", "").toLowerCase();
        System.out.println("Строка без пробелов:" + "'" + delSpace + "'");
        for (int i = 0; i < delSpace.length() / 2; i++)
            if (delSpace.charAt(i) == delSpace.charAt(delSpace.length() - i - 1)) {
                System.out.println("Строка - полиндром");
                return (true);
            }
        System.out.println("Строка - не полиндром");
        return (false);
    }
}
