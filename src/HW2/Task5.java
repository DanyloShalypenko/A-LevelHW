package HW2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        while (true) { // Цыкл, бесконечный потому что лень перезапускать для проверки.
            Scanner klog = new Scanner(System.in);
            System.out.print("Write your nubmer: ");
            int num = klog.nextInt(); // 1-st method

            System.out.println(reverse(num));
        }
    }
 public static int reverse (int num) {
        int reversenum = 0;
        while (num !=0) {
            reversenum = reversenum*10 + num%10;
            num /= 10;
        }
        return reversenum; // 1-st method
   }
}
