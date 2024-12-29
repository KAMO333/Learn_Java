//Static variables or method belong to the class, and are shared by all created objects within the class.
//Non-static belong to instances individually.

//static variables:
//public class Counter {
//    public static int COUNT = 0;
//    Counter() {
//        COUNT++;
//    }
//}
//
//class myCounter {
//    public static void main(String[] args) {
//        Counter c1 = new Counter();
//        Counter c2 = new Counter();
////        Counter c3 = new Counter();
//        System.out.println(Counter.COUNT);
//    }
//}

//    static method:
//    (i) don't need to create an instance to use them
class myCar {
    public static void horn() {
        System.out.println("Beep");
    }
}

class CarUsage {
    public static void main(String[] args) {
        myCar.horn();
    }
}

//Final keyword, this makes a variable's value final, meaning it can not be changed once it's assigned a value.
//methods and class can also be set to final to avoid overriding or subclassing.

