package corejava;//ABSTRACTION

//abstract class Animals {
//    int legs = 0;
//    abstract void makeSounds();
//}
//
////this class hides how the methods works, it just tells us what it does. this is abstraction.
////in order for use to use it, we must inherit it in our subclasses.
//
//class smallCat extends Animals {
//    public void makeSounds() {
//        System.out.println("Meow");
//    }
//}
//
//class bigProgram {
//    public static void main(String[] args) {
//        smallCat c = new smallCat();
//        c.makeSounds();
//    }
//}

//INTERFACE:
//These are entirely abstract classes with only abstract methods. methods are public.
//when using interface we need to override all of its methods.
//interface gives us a list of actions to be done, while not telling us how to do any of them.

//An interface is like a to-do list for classes, specifying actions that must be implemented.
//It focuses on what to do, leaving the how to do it to the implementing classes.

interface Wild {
    public void eat();
    public void makeSound();
}

class Cat implements Wild {
    public void makeSound() {
        System.out.println("meow meow");
    }

    public void eat() {
        System.out.println("munchiiiiing");
    }
}

public class AnotherAnimal {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.makeSound();
    }
}