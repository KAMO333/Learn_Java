import basics.*;
import oop.BankAccount;
import oop.Dog;

public class MyClass {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Vehicle car2 = new Vehicle("white");
        dog.bark();
        car2.horn();
        System.out.println(car2.getColor());

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT);

        BankAccount money = new BankAccount();
        money.deposit(55);
        money.withdraw(25);

        System.out.println(money.getBalance());

        Dog snoopy = new Dog();
        snoopy.eat();

        System.out.println(snoopy.getLegs());

    }

}
