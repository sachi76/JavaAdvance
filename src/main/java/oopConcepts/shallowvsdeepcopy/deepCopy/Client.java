package oopConcepts.shallowvsdeepcopy.deepCopy;

public class Client {
    public static void main(String[] args) {
        Address address = new Address("Bengaluru");
        Person person1 = new Person("Sachi", address);
        Person person2 = person1.toDeepCopy();

        person2.address.city = "Mysore";

        System.out.println(person1.address.city);
    }
}
