package oopConcepts.MultiThreading.Questions.NumberPrinter1to100;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
        }

    }
}
