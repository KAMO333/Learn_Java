//Hashmap:
//is basically you dictionary in Python.
//it has key value pairs objects.
//has methods that helps us manipulate data in it, put(), get(), remove()
//no duplicates, adding already existing key will override it.

//import java.util.HashMap;
//
//class Dictionary {
//    public static void main(String[] args) {
//        HashMap<String, Integer> dict = new HashMap<String, Integer>();
//        dict.put("John", 12);
//        dict.put("James", 10);
//        dict.put("Jack", 15);
//        System.out.println(dict.get("James"));
//    }
//}

//SET:
//is a collection that cannot hold a duplicate.
import java.util.HashSet;

class Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");

        System.out.println(set);
    }
}

//The HashSet class does not automatically retain the order of the elements as they're added.
// To order the elements, use a LinkedHashSet,
// which maintains a linked list of the set's elements in the order in which they were inserted.

//What is hashing?
//
//A hash table stores information through a mechanism called hashing, in which a key's informational content is used to determine a unique value called a hash code.
//
//So, basically, each element in the HashSet is associated with its unique hash code.
