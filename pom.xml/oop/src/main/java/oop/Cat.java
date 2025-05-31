package oop;

import basics.Animal;

public class Cat extends Animal implements PolyAnimal {
    public void speak() {
        System.out.println("cat is speaking...");
    }

    public void eat() {
        System.out.println("this animal eats fish");
    }
}
