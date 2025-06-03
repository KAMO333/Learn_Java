package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Iter{
    public static void main(String[] args) {
        LinkedList<String> xyz = new LinkedList<String>();

        xyz.add("abc");
        xyz.add("vfb");
        xyz.add("def");

        Iterator<String> it = xyz.iterator();
        while(it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }



    }
}
