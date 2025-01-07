//Java offers a package for sorting collections.
//which has other useful methods (max, min, shuffle, reverse)

//import java.util.ArrayList;
//import java.util.Collections;
//
//public class NewClass {
//    public static void main(String[] args) {
//        ArrayList<Integer> animals = new ArrayList<Integer>();
//        animals.add(4);
//        animals.add(3);
//        animals.add(1);
//        animals.add(2);
//
//        Collections.sort(animals);
//
//        System.out.println(animals.get(1));
//    }
//}

//ITERATOR:
//is like a remote control for a playlist:

//- It helps you go through a list of items (like songs) one at a time.
//- Pressing "next" (`next()`) moves to the next item and shows it.
//- It starts **before** the first item, so the first "next" gives the first item.
//- You can't go backward, only forward.
//Think of it as a simple tool to explore a collection step by step!

import java.util.Iterator;
import java.util.LinkedList;

class Good {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();

        animals.add("rabbit");
        animals.add("dog");
        animals.add("snake");
        animals.add("monkey");

        Iterator<String> it = animals.iterator();

        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

    }
}
