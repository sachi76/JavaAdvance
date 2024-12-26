package LLD.prototype;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();

        fillRegistry(studentRegistry);

        Student sachi = studentRegistry.getStudent("Aug23EveningBatch").clone();

        Student Ashika = studentRegistry.getStudent("Aug23EveningBatchIntelligent").clone();

        System.out.println("sachi");
    }

    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student aug23EveningBatch = new Student();
        aug23EveningBatch.setBatch("Aug23EveningBatch");
        aug23EveningBatch.setAvgBatchPsp(75.0);
        studentRegistry.register("Aug23EveningBatch", aug23EveningBatch);

        Student IntelligentStudent = new IntelligentStudent();
        IntelligentStudent.setBatch("Aug23EveningBatch");
        IntelligentStudent.setAvgBatchPsp(95.0);
        studentRegistry.register("Aug23EveningBatchIntelligent", IntelligentStudent);
    }
}
