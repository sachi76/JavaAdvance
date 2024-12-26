package oopConcepts.passByValuevsRef.passByValue;


// Java basically uses passByValue, but how it works can sometimes appear similar to
// passByReference, especially with objects
//when a primitive data type ( int, boolean, double) is passed as an argument to a method
// Java passes a copy of the value.
public class PassByValue {

    public static void modifyvalue(int value){
        value = 10;
    }
    public static void main(String[] args) {
        int value = 15;
        modifyvalue(value);
        System.out.println(value);

    }
}

//Original value of 15 is not changed in the output

