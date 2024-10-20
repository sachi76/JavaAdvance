package oopConcepts.shallowCopy;

public class Client {
    public static void main(String[] args) {
        Address address = new Address("Bengaluru");
        Person person = new Person("Sachin", address);
//        Person person1 = person.shallowCopy();
        Person person1 = new Person(person);

        person1.address.city = "Mysore";

        System.out.println(person.address.city);
    }
}
