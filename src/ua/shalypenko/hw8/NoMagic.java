package ua.shalypenko.hw8;

public class NoMagic {
    public static void main(String[] args) {
        MagicSubclass mySubObject = new MagicSubclass(934, "Hogwards Letter");
        mySubObject.displayVariables();
        mySubObject.finalMethod();
        mySubObject.harryPotterMethod();
    }
}

