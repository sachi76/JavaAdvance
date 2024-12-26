package oopConcepts.Collections.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("Python");
        myList.add("C++");

        //Getting an iterator
        Iterator<String> iterator = myList.iterator();;

        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println("Element: " + element);
        }
    }
}
