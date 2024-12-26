package oopConcepts.ExecutorAndCallables.Synchronisation.ReservationSystem;

public class OnlineReservationSystem {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem(50);
        Thread user1 = new Thread(()-> reservationSystem.reserveSeats(5,"Sachi"));
        Thread user2 = new Thread(()-> reservationSystem.reserveSeats(10, "Ashika"));
        Thread user3 = new Thread(()-> reservationSystem.reserveSeats(40,"Putti"));

        user1.start();
        user2.start();
        user3.start();

        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Remaining available seats: " + reservationSystem.getAvailableSeats());
    }
}
