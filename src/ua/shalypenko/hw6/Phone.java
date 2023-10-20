package ua.shalypenko.hw6;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }


    public Phone() {
        this("", "", 0.0);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("123-456-789", "iPhone 15", 0.2);
        Phone phone2 = new Phone("8800-555-3535", "Samsung Galaxy Gio");
        Phone phone3 = new Phone();

        phone3.number = "321-456-321";
        phone3.model = "Nokia 3310";
        phone3.weight = 1.5;

        System.out.println("Phone 1: Number - " + phone1.number + ", Model - " + phone1.model + ", Weight - " + phone1.weight);
        System.out.println("Phone 2: Number - " + phone2.number + ", Model - " + phone2.model + ", Weight - " + phone2.weight);
        System.out.println("Phone 3: Number - " + phone3.number + ", Model - " + phone3.model + ", Weight - " + phone3.weight);

        phone1.receiveCall("Danil");
        phone2.receiveCall("Max");
        phone3.receiveCall("Artem");

        System.out.println("Phone 1 Number: " + phone1.getNumber());
        System.out.println("Phone 2 Number: " + phone2.getNumber());
        System.out.println("Phone 3 Number: " + phone3.getNumber());
    }
}