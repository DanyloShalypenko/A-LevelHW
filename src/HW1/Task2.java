public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        System.out.println("Old a and b\n " + "a = " + a + " b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("New a and b\n " + "a = " + a + " b = " + b);
    }
}
