package oopConcepts.intro;

public class Client {
    public static void main(String[] args) {
        Student st = new Student("Sachi", 25, "male");
        st.printStudent();
        Student st2 = new Student(st);
        st2.setName("Vijay");
        st2.printStudent();

        Student st3 = new Student("sachi", 26);
        st3.printStudent();



    }
}
