package oopConcepts.shallowvsdeepcopy.shallowCopy;

public class Client {
    public static void main(String[] args) {
        Address address = new Address("Bengaluru");
        Person person1 = new Person("Sachi", address);
        Person person2 = person1.shallowCopy();
        Person person3 = new Person(person1);

        person2.address.city = "Mysore";
//        person3.address.city = "Shimoga";
        person3.name = "Vijay";

        System.out.println(person1.address.city);
        System.out.println(person1.name);
    }
}
