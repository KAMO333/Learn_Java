//ENCAPSULATION:

//Encapsulation is hiding certain info(variables & methods) from being accessed by anyone outside the class. Only those who are authenticated can access it.
//for example = using public methods like getters and setters or others.

class BankAccount {
//    Balance is hidden
    private double balance=0;
//    deposit method allows access to the hidden
    public void deposit(double x) {
        if(x > 0) {
            balance += x;
        }
    }
}

//INHERITANCE:
//inheritance is when a class inherits variables and methods of another class, in a hierarchical order.
//the class we inherit from is called the parent class(super class), the class we inherit to is the child class(subclass).
//we use the keyword "extends".

//class Dog [b]extends[/b] Animal {
//    // some code
//}

//class dog is (child) it inherits from animal class(parent)


//class Animal {
//    //protected access modifier, which makes the members visible only to the subclasses.
//    protected int legs;
//    public void eat() {
//        System.out.println("Animal eats");
//    }
//}
//
//class Dog extends Animal {
//    Dog() {
//        legs = 4;
//    }
//}
//
//class MainAnimal {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.eat();
//    }
//}

//constructors are not inherited by child classes but when we create an object using the child class
//the constructor of the parent is called.
class A {
    public A() {
        System.out.println("New a");
    }
}

class B extends A {
    public B() {
        System.out.println("New b");
    }
}

class Alpha {
    public static void main(String[] args) {
        B obj = new B();
    }
}



