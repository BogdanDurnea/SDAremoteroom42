package com.sda.petrariu.advanced.encapsulation.ex1;

public class Dog {
    private String name;
    private int age;
    private boolean male;
    private String race;
    private double weight;

    public Dog(String name, int age, boolean male, String race, double weight) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.race = race;
        this.weight = weight;
    }

    public Dog(boolean male, String race) {
        this("Poppy", 0, male, race, 0.02);
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.err.println("Invalid Age");
        }
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        if (race != null && !race.isBlank()) {
            this.race = race;
        }
        else {
            System.err.println("Invalid Race");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", male=" + male +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}

