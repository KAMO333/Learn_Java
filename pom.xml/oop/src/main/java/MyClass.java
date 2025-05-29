public class MyClass {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Vehicle car = new Vehicle();
        Vehicle car2 = new Vehicle("white");
        dog.bark();
        car2.horn();
        System.out.println(car2.getColor());

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT);
    }
}
