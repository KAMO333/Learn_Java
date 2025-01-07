//arraylist a arrays that stores objects.
//one must specify what type should the objects be.
//they have methods that helps us use them like (contains(), get(), size(), clear()).

import java.util.ArrayList;

class OtherClass {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.remove("Green");


        System.out.println(colors.contains("Black"));
        System.out.println(colors.get(1));
        System.out.println(colors.size());
    }
}
