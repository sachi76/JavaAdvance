package oopConcepts.shallowvsdeepcopy.deepCopy;

public class Address {
    String city;

    public Address(String city){
        this.city = city;
    }

    public Address deepCopy(){
        return new Address(this.city);
    }
}
