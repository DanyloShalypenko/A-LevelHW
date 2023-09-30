package HW2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        while (true) { // Цыкл, бесконечный потому что лень перезапускать для проверки.
            Scanner klog = new Scanner(System.in);
            System.out.print("Write your nubmer: ");
            int num = klog.nextInt();

          //System.out.println(reverseWithInt(num)); 1-st method
            System.out.println(reverseWithString(num)); // 2-nd method
        }
    }
 public static int reverseWithInt (int num) {
        int reversenum = 0;
        while (num !=0) {
            reversenum = reversenum*10 + num%10;
            num /= 10;
        }
        return reversenum; // 1-st method
   }
    public static String reverseWithString(int num) {
        String numStr = Integer.toString(num);
        String reversedNumbStr = new StringBuilder(numStr).reverse().toString();

        if (reversedNumbStr.endsWith("-")) {
            reversedNumbStr = "-" + reversedNumbStr.substring(0, reversedNumbStr.length() - 1);
        }

        return reversedNumbStr;
    } // 2-nd method
}
