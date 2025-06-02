package collections;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String>  points = new HashSet<String>();
        points.add("10");
        points.add("5");
        points.add("5");

        System.out.println(points);
    }
}
