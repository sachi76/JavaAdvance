package oopConcepts.ExecutorAndCallables.MergerSortProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;



public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arr;
    private ExecutorService executorService;

    public Sorter(List<Integer> arr, ExecutorService executorService){
        this.executorService = executorService;
        this.arr = arr;
    }


    @Override
    public List<Integer> call() throws Exception {

        if(arr.size() <=1){
            return arr;
        }

        int n = arr.size();
        int mid = n/2;

        List<Integer> leftArr = new ArrayList<>();
        List<Integer> rightArr = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArr.add(arr.get(i));
        }

        for(int i=mid;i<n;i++){
            rightArr.add(arr.get(i));
        }

        Sorter leftSorter = new Sorter(leftArr, executorService);
        Sorter rightSorter = new Sorter(rightArr,executorService);


        Future<List<Integer>> leftFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightFuture = executorService.submit(rightSorter);

        leftArr = leftFuture.get();
        rightArr = rightFuture.get();


        //merger code
        int i=0;
        int j=0;
        List<Integer> output = new ArrayList<>();

        while(i<leftArr.size() && j<rightArr.size()){
            if(leftArr.get(i) < rightArr.get(j)){
                output.add(leftArr.get(i));
                i++;
            }
            else {
                output.add(rightArr.get(j));
                j++;
            }
        }

        while(i<leftArr.size()){
            output.add(leftArr.get(i));
            i++;
        }
        while(j<rightArr.size()){
            output.add(rightArr.get(j));
            j++;
        }

        return output;
    }
}
