package Shalypenko_hw2;

public class Task4 {
    public static void main(String[] args) {
        double num1 = 5.0;
        double num2 = -3.0;
        double num3 = 7.0;

        printSmallestValue(num1, num2, num3);
    }

    public static void printSmallestValue(double num1, double num2, double num3) {

        double absNum1 = num1 < 0 ? -num1 : num1;
        double absNum2 = num2 < 0 ? -num2 : num2;
        double absNum3 = num3 < 0 ? -num3 : num3;

        double smallestAbsValue = (absNum1 <= absNum2 && absNum1 <= absNum3) ? num1 :
                (absNum2 <= absNum1 && absNum2 <= absNum3) ? num2 :
                        num3;


        System.out.println("Меньшее по модулю число: " + smallestAbsValue);
    }
}