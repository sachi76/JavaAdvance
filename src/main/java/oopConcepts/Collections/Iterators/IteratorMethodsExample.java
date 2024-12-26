package oopConcepts.Collections.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMethodsExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Iterator<Integer> iterator = numbers.iterator();

// Using hasNext() and next() methods
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println("Number: " + number);

// Using remove() method (optional operation)
//            iterator.remove();
        }
        System.out.println("Updated List: " + numbers);
    }
}
