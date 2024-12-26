package oopConcepts.Collections.Iterators;

import java.util.Iterator;
import java.util.PriorityQueue;

public class IteratorPriority {
    public static void main(String[] args) {
        //creating a prirityQueue with integer elements
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(38);

        System.out.println("Elements in PriorityQueue using Iterator");

        Iterator<Integer> iterator = priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
