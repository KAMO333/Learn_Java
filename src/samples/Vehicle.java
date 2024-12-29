package samples;
//CLASS act as blueprint for creating objects. They have attributes(description), methods(actions).
//(i) We use these for objects nature and behaviour.
//(ii) We can use these in the main class, which act as the core of our program, where the whole program is running.

//public class samples.Vehicle {
//    int maxSpeed;
//    int wheels;
//    String color;
//    double fuelCapacity;
//
//    void horn() {
//        System.out.println("Beep!");
//    }
//}
//
//class CoreClass {
//    public static void main(String[ ] args) {
//        samples.Vehicle v1 = new samples.Vehicle();
//        samples.Vehicle v2 = new samples.Vehicle();
//        v1.color = "red";
//        v2.horn();
//    }
//}

//CONSTRUCTOR == a method called when objects are created, it can give variables default values.
//(i) same name as class
//(ii) no return statement

//public class samples.Vehicle {
//    private String color;
//    samples.Vehicle() {
//        color = "Red";
//    }
//}

//(iii) they can take parameters to initialize them.
//public class samples.Vehicle {
//    private String color;
//    samples.Vehicle(String c) {
//        color = c;
//    }
//}

//THEY SET UP MY CLASS BY DEFAULT.
// Java automatically provides a default constructor, so all classes have a constructor, whether one is specifically defined or not.

public class Vehicle {
    private String color;

    Vehicle() {
        this.setColor("Red");
    }

    Vehicle(String c) {
        this.setColor(c);
    }

    //setter
    public void setColor(String c) {
        this.color = c;
    }

//    getter
    public String getColor() {
        return color;
    }

public class CoreFunc {
        public static void main(String[ ] args) {
//          creates object with red as color
            Vehicle v1 = new Vehicle();
//          creates object with green as color
            Vehicle v2 = new Vehicle("Green");
            System.out.println(v2.getColor());
        }
}


}
