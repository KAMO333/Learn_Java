package oop;

public class Animals {
    protected int legs;
    protected int eyes = 2;

    public Animals (String name){
        System.out.println("Animals name is " + name);
    }

    public void eat() {
        System.out.println("Lets eat!");
    }
}

