package shalypenko_hw1;

public class Task3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("Old a and b\n " + "a = " + a + " b = " + b);

        a = a * b;
        b = a / b;
        a = a / b;

       /* a = a + b;
        b = a - b;
        a = a - b;  */

        System.out.println("New a and b\n " + "a = " + a + " b = " + b);
    }
}
