package oopConcepts.ExecutorAndCallables.ExecutorDemo;

public class NumberPrinter  implements Runnable {

    int number;

    public NumberPrinter(int number){
        this.number = number;
    }

    public NumberPrinter(){}

    @Override
    public void run() {
        System.out.println("Number" + number + " thread number " + Thread.currentThread().getName());
    }
}
