package oopConcepts.Static;


// static belongs to class not instance or obj
// static method cannot call non static atributes, compile time error will be thrown in
// that case
public class Static {
    public static String name = "Sachidanand";
    public String name1 = "Sachidanand1";

    public static void myStatic(){
        System.out.println(name);
    }

}
