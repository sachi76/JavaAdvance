package oopConcepts.passByValuevsRef.passByRef;

public class Client {
    public static void modifyPerson(Person p){
        p.name = "Alice"; // This change affects original obj
        p = new Person("Bob"); // this change only affects local ref
    }
    public static void main(String[] args) {
        Person person = new Person("Sachi");
        modifyPerson(person);
        System.out.println(person.name);
    }
}
