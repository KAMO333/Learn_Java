package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

//    public static void main(String[] args) {
//        ArrayList<String> animals = new ArrayList<String>();
//
//        animals.add("tiger");
//        animals.add("lion");
//        animals.add("panda");
//
//        Collections.sort(animals);
//
//        System.out.println(animals);
//    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(43);
        numbers.add(32);
        numbers.add(23);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
