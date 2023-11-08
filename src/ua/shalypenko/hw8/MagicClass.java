package ua.shalypenko.hw8;


public class MagicClass {
    public int number;
    public String string;

    public MagicClass(int number, String string) {
        this.number = number;
        this.string = string;
    }

    public void displayVariables() {
        System.out.println("Value: " + number);
        System.out.println("Text: " + string);
    }

    public final void finalMethod() {
        System.out.println("This is a final method in MagicClass");
    }

}

