package oopConcepts.MultiThreading.waysToCreateThread.UsingRunnable;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new SimpleRunnable());
        t.start();
    }
}
