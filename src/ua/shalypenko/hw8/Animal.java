package ua.shalypenko.hw8;

import java.util.Comparator;

public class Animal {
    private String kindOFood;
    private int hoursOfSleeping;
    public void eat() {;
        System.out.println("Eat " + kindOFood);
    }
    public void sleep() {
        System.out.println("Sleep " + hoursOfSleeping);
    }

    public void setKindOFood(String kindOFood) {
        this.kindOFood = kindOFood;
    }

    public String getKindOFood() {
        return kindOFood;
    }

    public int getHoursOfSleeping() {
        return hoursOfSleeping;
    }

    public void setHoursOfSleeping(int hoursOfSleeping) {
        if (hoursOfSleeping < 0) {
            System.out.println("Hours of sleeping must be positiv");
        } else {
            this.hoursOfSleeping = hoursOfSleeping;
        }
    }

}