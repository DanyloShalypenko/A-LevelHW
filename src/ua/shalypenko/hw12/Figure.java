package ua.shalypenko.hw12;

class InvalidParameterException extends Exception {
    public InvalidParameterException(String message) {
        super(message);
    }
}

class Figure {
    public double perimeter() {
        return 0.0;
    }

    public double area() {
        return 0.0;
    }
}

