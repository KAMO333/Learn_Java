package collections;

import java.util.HashMap;

public class Dict {

    public static void main(String[] args) {
        HashMap<String, Integer> persons = new HashMap<String, Integer>();
        persons.put("moroka", 33);
        persons.put("kamo", 32);
        persons.put("d", 28);


        System.out.println(persons);

    }
}
