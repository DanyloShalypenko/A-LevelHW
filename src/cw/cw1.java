package cw;

import java.util.Scanner;

public class cw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.print("Введите степень: ");
        int power = scanner.nextInt();
        int result = pow(number, power);
        System.out.println(result);
    }

    public static int pow(int value, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= value;
        }
        return result;
    }
}


