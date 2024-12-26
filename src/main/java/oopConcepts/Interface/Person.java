package oopConcepts.Interface;

public interface Person {
    String batchName = "sachi";

     static void printName(){
        System.out.println("Hello" + batchName);
    }

    String getName();
    String getEmail();
}
