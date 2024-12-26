package oopConcepts.polymorphism.MethodOverloading;

public class User {
    private String name;
    private String age;

    public User(){}

    public User(String name, String age){
        this.name = name;
        this.age = age;
    }

    public void printUser(){
        System.out.println("Hello");
    }

    public void printUser(String name){
        System.out.println(this.name + " says Hello to " + name);
    }

    public void printUser(String age, String name){
        System.out.println(this.name +" of age "+ this.age +" says Hello to " + name + " of age "+ age);

    }
}
