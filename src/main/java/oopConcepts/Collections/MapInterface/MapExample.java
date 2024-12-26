package oopConcepts.Collections.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> mymap = new HashMap<>();
        mymap.put("Java", 45);
        mymap.put("Sachi", 45);
        mymap.put("Vijay", 45);

        System.out.println("Map elements: " + mymap);

    }
}
