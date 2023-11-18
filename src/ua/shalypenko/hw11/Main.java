package ua.shalypenko.hw11;

class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(3);

        list.add("apple");
        list.add(42); // int value
        list.add(213);

        System.out.println("ArrayList after initial addition:");
        printArrayList(list);

        list.add("date", 3);

        System.out.println("\nArrayList after adding an element at index 1:");
        printArrayList(list);

        int index = list.indexOf(42);
        System.out.println("\nIndex of 42: " + index);

        boolean contains = list.isContains("grape");
        System.out.println("Contains grape': " + contains);
    }

    public static void printArrayList(ArrayList list) {
        for (int i = 0; i < list.getSize(); i++) {
            Object element = list.get(i);
            System.out.println(element);
        }
    }
}