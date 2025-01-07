//arraylist a arrays that stores objects.
//one must specify what type should the objects be.
//they have methods that helps us use them like (contains(), get(), size(), clear()).
//can specify the initial capacity.

//import java.util.ArrayList;

//class OtherClass {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Red");
//        colors.add("Blue");
//        colors.add("Green");
//        colors.add("Yellow");
//        colors.remove("Green");
//
//
//        System.out.println(colors.contains("Black"));
//        System.out.println(colors.get(1));
//        System.out.println(colors.size());
//    }
//}

import java.util.LinkedList;

class OtherClass {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.remove("Green");


        System.out.println(colors.contains("Black"));
        System.out.println(colors.get(1));
        System.out.println(colors.size());

        for(String c: colors) {
            System.out.println(c);
        }
    }
}

//Linkedlist are similar to in syntax to arraylist.
//but we can not specify the initial capacity of a linkedlist


//WHICH TO USE, WHEN.
//- Use an ArrayList when you need rapid access to your data.
//- Use a LinkedList when you need to make a large number of inserts and/or deletes.
