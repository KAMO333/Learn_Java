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

        System.out.println(colors);

    }
}
