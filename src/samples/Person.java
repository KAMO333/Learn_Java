package samples;//there are a number of data type is Java = int, float, double, short, long, string, char.
//Java is passed by value meaning, it operates on the variables values not the variable themselves.

//public class Pass {
//    public static void main(String[ ] args) {
//        int x = 4;
//        square(x);
//        System.out.println(x);
//    }
//
//    static void square(int x) {
//        x = x*x;
//    }
//}

//this return 4 because, the square function creates a copy of x's value then modifies it. But doesn't
// return it to the main function, the original x value is not affected, it remains 4. for us to change
// the original x we need to return the copy of the modified value of x in square method with the "return" statement.


//VALUE AND REFERENCE TYPES
//A reference type stores a reference (or address) to the memory location where the corresponding data is stored.
//When you create an object using the constructor, you create a reference variable.

class MainCoreClass {
    public static void main(String[] args) {
        Person j;
        j = new Person("John");
        j.setAge(20);
        Celebrate(j);
        System.out.println(j.getAge());
    }

    static void Celebrate(Person p) {
        p.setAge(p.getAge() + 1);
    }
}
public class Person {
    private String name;
    private int age;

    Person (String n) {
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }
}

//Key Difference in Simple Terms:
//Value types: You give someone a copy of the data. Changing the copy doesn’t affect the original.
//Reference types: You give someone a key to the same data. Changing it affects the original because both are pointing to the same thing.

//// Value type
//int x = 4;              // x stores the actual number 4
//int y = x;              // y gets a copy of 4
//y = 10;                 // Changing y doesn't affect x
//System.out.println(x);  // Output: 4
//
/// / Reference type
//int[] locker = {4};         // locker stores an address pointing to the array
//int[] key = locker;         // key points to the same array
//key[0] = 10;                // Changing key affects the original array
//System.out.println(locker[0]); // Output: 10