package com.sda.petrariu.advanced.encapsulation.ex1;

/**
 * Create class Dog.
 * a) Add private fields to the class, like name, age, gender, race, weight.
 * b) Create constructor that accepts all of the class fields.
 * c) Create additional constructor, that will accept only gender and race. It should call main constructor with default values.
 * d) Create getters and setters for age and weight.
 * e) Create object of class Dog. Verify if everything works as expected.
 * f) Add verification for all arguments passed to the setters. E.g. setWeight method should not accept values below or equal to 0.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(true, "dalmatian");
        System.out.println(dog1);

        Dog dog2 = new Dog("azorel", 8, true, "dalmatian", 3.80);
        System.out.println(dog2);
        dog2.setRace(null);
        dog2.setRace("");
        dog2.setRace("pitbull");
        dog2.setRace("  ");
        System.out.println(dog2);
    }
}
