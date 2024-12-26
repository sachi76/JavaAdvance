package oopConcepts.shallowvsdeepcopy.shallowCopy;

public class Person {
    String name;
    Address address;

    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public Person(Person old){
        this.name = old.name;
        this.address = old.address;
    }

    public Person shallowCopy(){
        return new Person(this.name, this.address);
    }
}
