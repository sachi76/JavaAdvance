package oopConcepts.Semaphores.TShirtStoreusingSemaphores;

import java.util.concurrent.Semaphore;

public class TShirtStore {
    private static final int STORE_CAPACITY = 5;
    private static Semaphore mutex = new Semaphore(1); //controls access to critical section
    private static Semaphore empty = new Semaphore(STORE_CAPACITY); //represents empty slots in the store
    private static Semaphore full = new Semaphore(0); //represents filled slots in the store
    private static int tShirtCount = 0;

    static class Producer implements Runnable{

        @Override
        public void run() {
            try{
                while(true){
                    empty.acquire(); //wait for an empty slot
                    mutex.acquire(); // Enter critical section

                    //produce a shirt
                    System.out.println("Producer produces a T-shirt. Total T-shirts: " + ++tShirtCount);
                    mutex.release(); // Exit critical section
                    full.release(); // Signal that a T-shirt is ready to be consumed
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    static class Consumer implements Runnable{

        @Override
        public void run() {
            try{
                while (true){
                    full.acquire(); //wait for a T-shirt to be available
                    mutex.acquire(); //enter the critical section

                    //consume a T-shirt
                    System.out.println("Consumer buys a T-shirt. Total T-shirts" + --tShirtCount);

                    mutex.release();
                    empty.release();
                    Thread.sleep(1500);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        producerThread.start();
        consumerThread.start();
    }


}
