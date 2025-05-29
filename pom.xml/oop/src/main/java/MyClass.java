public class MyClass {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Vehicle car = new Vehicle("white");
        dog.bark();
        car.horn();
        System.out.println(car);
    }
}
