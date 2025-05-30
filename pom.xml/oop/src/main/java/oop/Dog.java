package oop;

//Inheritance

public class Dog extends Animals {
    public Dog() {
        super("snoopy");
        this.legs = 4;
    }

    public int getLegs() {
        return legs;
    }

    public String showEyes() {
        return "Dogs eyes: " + super.eyes;
    }
}
