package collections;

import java.util.ArrayList;

public class Arrays {
    static ArrayList colors = new ArrayList();

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
