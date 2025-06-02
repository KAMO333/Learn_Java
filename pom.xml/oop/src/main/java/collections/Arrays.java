package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arrays {
    static LinkedList<String> colors = new LinkedList<String>();

    public static void main(String[] args) {
        colors.add("Blue");
        colors.add("White");
        colors.add("Red");
        colors.add("Black");
        colors.remove("Blue");

        System.out.println(colors.contains("White"));
        System.out.println(colors.size());
        System.out.println(colors.clone());
        System.out.println(colors.get(2));
        colors.clear();

        System.out.println(colors);

    }
}
