//run time polymorphism. method overloadding. Also known as Dynamib method dispatch.
// when a derived class has a definition for one of the member functions of the base class. That base function is said to be overridden.

package Polymorphism;

public class RunTimePolymorphism {
    public static void main(String args[]) {
        ParentClass p;
        p = new ParentClass();
            p.print();
        p = new SubClass1();
            p.print();
        p = new SubClass2();
            p.print();
    }    
}
