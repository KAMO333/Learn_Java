//Access Modifiers.
//These set variable to be accessable by other classes in and out our program.
//public == accessable by other classess.
// default == available to any class with same package
// protected == same as default but subclasses can access superclass variables and methods.
// private == used within that specific class only, unless accessed with getters and setters.

//public class CarOne {
//    private int maxSpeed;
//    private int wheels;
//    private String color;
//    private double fuelCapacity;
//
//    public void horn() {
//        System.out.println("Beep!");
//    }
//}


//using getters and setters.
// getter = get + Attribute name (Capital letter) == getColor. get and return the value of attribute.
// setter  = set + Attribute name (Capital latter) == setColor. set value of attribute, passing it a parameter.

public class Car {
    private String color;
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String c) {
        this.color = c;
    }
}

class Program {
    public static void main(String[ ] args) {
        Car car1 = new Car();
        car1.setColor("Blue");
        System.out.println(car1.getColor());

    }

}
