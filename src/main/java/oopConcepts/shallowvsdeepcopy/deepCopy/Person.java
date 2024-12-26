package oopConcepts.shallowvsdeepcopy.deepCopy;

public class Person {
    String name;
    Address address;

    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public Person toDeepCopy(){
        return new Person(this.name, this.address.deepCopy());
    }
}
