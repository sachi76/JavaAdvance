package oopConcepts.ExecutorAndCallables.Synchronisation.ReservationSystem;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReservationSystem {
   private int availableSeats;
   private final Lock lock = new ReentrantLock();

   public ReservationSystem(int availableSeats){
       this.availableSeats = availableSeats;
   }

   public void reserveSeats(int numOfSeats, String user){
       lock.lock();
       try{
           if(numOfSeats>0 && numOfSeats <= availableSeats){
               System.out.println("Reserving " + numOfSeats+ " for the " + user);
               availableSeats -= numOfSeats;
           }else {
               System.out.println("Unable to reserve " + numOfSeats+ " for the " + user + " ,try again later.");

           }
       }finally{
           lock.unlock();
       }
   }

   public int getAvailableSeats(){
       return availableSeats;
   }
}
