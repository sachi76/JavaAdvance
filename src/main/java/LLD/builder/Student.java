package LLD.builder;

public class Student {

    private String name;
    private int age;
    private double psp;
    private int gradYear;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.psp = builder.psp;
        this.gradYear = builder.gradYear;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder{
        private String name;
        private int age;
        private double psp;
        private int gradYear;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student build() {

            if(this.getGradYear()>= 2024){
                throw new RuntimeException("GradYear should be less than 2024");
            }

            return new Student(this);
        }
    }

}
