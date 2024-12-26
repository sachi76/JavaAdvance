package oopConcepts.polymorphism.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        User user = new User("Ashika", "26");
        user.printUser();
        user.printUser("Sachi");
        user.printUser("26", "Sachi");
    }
}
