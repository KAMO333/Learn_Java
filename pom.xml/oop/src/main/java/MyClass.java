public class MyClass {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Vehicle car = new Vehicle();
        dog.bark();
        car.horn();
        car.setColor("red");
        System.out.println(car.getColor());
    }
}
