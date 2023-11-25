package ua.shalypenko.hw8;

public class MagicSubclass extends MagicClass {
    public MagicSubclass(int number, String string) {
        super(number, string);
    }

    @Override
    public void displayVariables() {
        System.out.println("New Value:  " + number);
        System.out.println("New Text: " + string);
    }

    public void harryPotterMethod() {
        System.out.println("Its Magic Harry!");
    }
}
