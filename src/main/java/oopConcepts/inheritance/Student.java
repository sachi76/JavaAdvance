package oopConcepts.inheritance;

public class Student extends User{

    private String batchName;
    private int psp;

    public Student(String name, String age, String batchName, int psp){
        super(name, age);
        this.batchName = batchName;
        this.psp = psp;
    }

}
