//method overloading, complie time polymorphism, also known as static polymorphism.
// mutiple method/funtion with same name can be present & each iteration of the method/function performing different task or work.
//can be overloaded with wiffernt arrguments or with different numbers or types of arrguments.

package Polymorphism;

public class CompileTimePolymorphism {
    public static void main(String args[]) {
            System.out.println("Performing One: " +Multiply.MultiplyMethod(3, 56));
            System.out.println("Performing Two: " +Multiply.MultiplyMethod(3, 56, 34));
    }    
}