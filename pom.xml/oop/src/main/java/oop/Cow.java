package oop;

import basics.Animal;

public class Cow extends Animal implements PolyAnimal {

    public void speak() {
        System.out.println("cow is speaking...");
    }

    public void eat() {
        System.out.println("This animal eats grass!");
    }
}
