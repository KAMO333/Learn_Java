package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        List<Integer> numbers = new ArrayList<>();

        numbers.add(43);
        numbers.add(32);
        numbers.add(23);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
