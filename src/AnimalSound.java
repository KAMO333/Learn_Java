//POLYMORPHISM
//is when different subclasses inherit from the same superclass but use the superclasses
//properties in their own different ways.

//class Animal {
//    public void makeSound() {
//        System.out.println("Grr...");
//    }
//}
//class Cat extends Animal {
//    public void makeSound() {
//        System.out.println("Meow");
//    }
//}
//class Dog extends Animal {
//    public void makeSound() {
//        System.out.println("Woof");
//    }
//}
//
//class MainSounds {
//    public static void main(String[ ] args) {
//        Animal a = new Dog();
//        Animal b = new Cat();
//
//        a.makeSound();
//        b.makeSound();
//    }
//}

//OVERRIDING:
//this is also called overriding, rule for overriding are:
//(i) constructors can't be overridden.
//(ii) final and static can't be overridden
//(ii) if it's not inherited it can't be overridden.
//(iv) must have the same return type and arguments.
//(v) access level must be the same, if superclass is public, subclass can not be otherwise (private/protected)

//Method overriding is also known as runtime polymorphism.

//OVERLOADING:
//is when you have methods with same names but want to use them with different parameters.
//for example = :

class Calculate {
    static double bigNum(double a, double b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    static int bigNum(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println(bigNum(10, 5));
        System.out.println(bigNum(10.50, 5.50));
    }
}

//in order for overloading to happen, parameters types must be different

//Another name for method overloading is compile-time polymorphism.



