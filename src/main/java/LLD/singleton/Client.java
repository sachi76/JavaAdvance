package LLD.singleton;

public class Client {
  public static void main(String[] args) {
      Thread t1 = new Thread(new DBConnectionTestTask(), "Thread-1");
      Thread t2 = new Thread(new DBConnectionTestTask(), "Thread-2");
      Thread t3 = new Thread(new DBConnectionTestTask(), "Thread-3");
      t1.start();
      t2.start();
      t3.start();

      try{
          t1.join();
          t2.join();
          t3.join();
      }catch(InterruptedException e){
          e.printStackTrace();
      }

      System.out.println("All threads completed execution");
  }
}


class DBConnectionTestTask implements Runnable{

    @Override
    public void run() {
        DBConnection dbConnection = DBConnection.getInstance();

        System.out.println(Thread.currentThread().getName() + " obtained instance: " + dbConnection.hashCode());
    }
}