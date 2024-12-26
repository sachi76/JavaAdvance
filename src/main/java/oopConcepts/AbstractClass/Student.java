package oopConcepts.AbstractClass;

public class Student extends User {

    public String PspCalculator(){
        return "100%";
    }

    @Override
    public String attendanceCalculator() {
        return "100%";
    }
}
