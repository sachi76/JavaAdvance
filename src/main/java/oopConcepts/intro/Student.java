package oopConcepts.intro;


//OOP is evolution from procedural programming
// whats important take away from object oriented programming?
// its similar to real life, entity is not controlled by methods and attributes.
// here, entity does the work, rather then work is done by entity in case of procedural
// OOP is governed by 1 principle and 3 pillars.
// Principle : Abstraction
// Pillars: encapsulation, polymorphisms, inheritance
// Encapsulation is implemented by class using access modifiers
//eg
public class Student {
   private String name;
   private int age;
   private String gender;

   public Student(){};

   public Student(String name, int age, String gender){
       this.age = age;
       this.name = name;
       this.gender = gender;
   }

   public Student(String name, int age){
       this.name = name;
       this.age = age;
   }

   public String getName(){
       return name;
   }

   public void setName(String name){
       this.name = name;
   }

   public int getAge(){
       return age;
   }

   public void setAge(int age){
       this.age = age;
   }

   public String getGender(){
       return gender;
   }

   public void setGender(String gender){
       this.gender = gender;
   }

   public void printStudent(){
       System.out.println(this.name);
       System.out.println(this.age);
       System.out.println(this.gender);
   }

   public Student(Student old){
       this.name = old.name;
       this.age = old.age;;
       this.gender=old.gender;
   }
}
