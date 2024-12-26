package LLD.builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.newBuilder()
                .setName("Sachi")
                .setGradYear(2021)
                .setPsp(95)
                .setAge(26)
                .build();

        System.out.println(student);
    }

}
