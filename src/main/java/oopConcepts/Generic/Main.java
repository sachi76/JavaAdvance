package oopConcepts.Generic;

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box();
        intBox.addContent(42);
        System.out.println("box content: " + intBox.getContent());

        Box<String> stringBox = new Box();
        stringBox.addContent("Sachi");
        System.out.println("box content: " + stringBox.getContent());


    }
}
