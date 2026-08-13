package week6.KeyVal;

import java.util.*;

/*

 */

public class TestMaps {
    static void main(String[] args) {
        Map<String,Integer> NameAge = new HashMap<>();
        // if the key already exists in the Map then put returns the previous value corresponding that Key
        NameAge.put("Sandeep",20);
        NameAge.put("Aniket",20);
        NameAge.put("Abhay",20);
        NameAge.remove("Sandeep");
        System.out.println(NameAge.get("Abhay")); // returns 20
        System.out.println(NameAge);

        // Inserting key as null
        NameAge.put(null,90);
        System.out.println(NameAge.get(null));

        // Now this is safe method where instead of exception we get default value
        NameAge.getOrDefault("FOff",0);
        NameAge.putIfAbsent("Hi",0);


        // Duplicate key => Changes the value of that Key with new Value
        NameAge.put("Sandeep",21);
        System.out.println(NameAge.get("Sandeep"));

        System.out.println(NameAge);

        // to extract Keys and Values from the map
        Set<String> keys = NameAge.keySet();
        System.out.println(keys);

        // to extract values
        Collection<Integer> vals= NameAge.values();
        System.out.println(vals);

        // to extract key values
        Set<Map.Entry<String,Integer>> KeyVal = NameAge.entrySet();
        System.out.println(KeyVal);

    }
}
