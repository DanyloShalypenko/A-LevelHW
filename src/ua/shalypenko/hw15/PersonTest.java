package ua.shalypenko.hw15;

import java.lang.reflect.Field;

class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter methods can be added if needed

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

class PersonFactory {
    public Person createPerson(String name, int age, String address) {
        return new Person(name, age, address);
    }

    public void printFields(Object obj) {
        Class<?> objClass = obj.getClass();
        Field[] fields = objClass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                System.out.println(field.getName() + ": " + field.get(obj));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PersonTest {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();

        // Creating a Person object
        Person person = personFactory.createPerson("Даня", 21, "123 MУлица");

        // Printing fields of the Person object using reflection
        personFactory.printFields(person);
    }
}

