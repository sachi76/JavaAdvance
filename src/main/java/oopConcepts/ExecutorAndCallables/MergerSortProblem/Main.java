package oopConcepts.ExecutorAndCallables.MergerSortProblem;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
//        List<Integer> l = List.of(3,6,8,1,2,5,0);
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        Sorter sorter = new Sorter(l,executorService);
//        Future<List<Integer>> output = executorService.submit(sorter);
//        System.out.println(output.get()); //Blocking Code
//        executorService.shutdown();

        List<Integer> l = List.of(9,4,2,3,5,6,7,1);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(l,executorService);

        Future<List<Integer>> output = executorService.submit(sorter);

        System.out.println(output.get());

        executorService.shutdown();

    }
}