package oopConcepts.Collections.Setinterface;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Sachi");
        mySet.add("Vijay");
        mySet.add("Java");

        System.out.println("Set elements: " + mySet);
    }
}
