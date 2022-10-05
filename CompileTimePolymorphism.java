//method overloading, complie time polymorphism, also known as static polymorphism.
// mutiple method/funtion with same name can be present & each iteration of the method/function performing different task or work.
//can be overloaded with wiffernt arrguments or with different numbers or types of arrguments.

class Perform {
    static int Multiply(int a, int b) {
        return a*b;
    }

    static int Multiply(int a, int b, int c) {
        return a*b*c;
    }
}
public class CompileTimePolymorphism {
    public static void main(String args[]) {
            System.out.println("Performing One: " +Perform.Multiply(3, 56));
            System.out.println("Performing Two: " +Perform.Multiply(3, 56, 34));
    }    
}
