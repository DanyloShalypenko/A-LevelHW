package ua.shalypenko.hw8;

public class MaxAnimalEat {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.setKindOFood("Grass");
        animal1.setHoursOfSleeping(12);

        Animal animal2 = new Animal();
        animal2.setKindOFood("Meat");
        animal2.setHoursOfSleeping(10);

        Animal animal3 = new Animal();
        animal3.setKindOFood("Fish");
        animal3.setHoursOfSleeping(6);

        Animal animalWithMaxSleep = findAnimalWithMaxSleep(animal1, animal2, animal3);

        System.out.println("Longest sleep " + animalWithMaxSleep.getHoursOfSleeping());
        animalWithMaxSleep.eat();

    }

    private static Animal findAnimalWithMaxSleep(Animal... animals) {
        Animal maxSleepingAnimal = null;
        int maxSleep = 0;

        for (Animal animal : animals) {
            if (animal.getHoursOfSleeping() > maxSleep) {
                maxSleep = animal.getHoursOfSleeping();
                maxSleepingAnimal = animal;
            }
        }

        return maxSleepingAnimal;
    }
}

