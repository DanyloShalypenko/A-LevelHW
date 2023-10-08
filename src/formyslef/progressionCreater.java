package formyslef;

import java.util.Random;
import java.util.Scanner;

public class progressionCreater {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner klog = new Scanner(System.in);
        while (true) {

            System.out.println("1 - ариф. прог. 2 - геом. прог");
            int choose = klog.nextInt();
            if (choose == 1) {
                int a1 = random.nextInt(9) + 1;
                int d = random.nextInt(9) + 2;
                int na = random.nextInt(12) + 7;
                System.out.println("a1 = " + a1 + " " + "d = " + d + " na = " + na);
                ArProg(a1, d, na);

            } else {
                int b1 = random.nextInt(7) + 2;
                int q = random.nextInt(6) + 2;
                int nb = random.nextInt(8) + 5;
                System.out.println("b1= " + b1 + "\n" + "q= " + q + "\nnb= " + nb);
                GeomProg(b1, q, nb);
            }
        }


    }

    public static void ArProg(int a1, int d, int na) {
        int an = 0;
        for (int i = 2; i <= na; i++) {
            an = a1 + (i - 1) * d;
            System.out.print("a" + i + " = " + an);
            double sum = (double) (a1 + an) / 2 * i;
            System.out.println(" sum = " + sum);
        }


    }

    public static void GeomProg(int b1, int q, int nb) {
        double bn = 1;
        for (int i = 2; i <= nb; i++) {
            bn = b1 * Math.pow(q, i - 1);
            System.out.print("b" + i + " = " + bn);
            double sum = (double) b1 * (1 - Math.pow(q, i)) / (1 - q);
            System.out.println(" sum= " + sum);
        }

    }


}
