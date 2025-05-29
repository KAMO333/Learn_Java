import basics.*;

public class MyClass {
    public static void main(String[] args) {
        Animal dog = new Animal();
//        basics.Vehicle car = new basics.Vehicle();
        Vehicle car2 = new Vehicle("white");
        dog.bark();
        car2.horn();
        System.out.println(car2.getColor());

        int x = 5;
        addOneTo(x);
        System.out.println(x);

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT);
    }

    static void addOneTo(int num) {
        num = num + 1;
    }
}
