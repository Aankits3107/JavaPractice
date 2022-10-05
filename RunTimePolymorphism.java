//run time polymorphism. method overloadding. Also known as Dynamib method dispatch.
// when a derived class has a definition for one of the member functions of the base class. That base function is said to be overridden.
class Parent {
    void print() {
        System.out.println("One Printing...");
    }
}
class Child1 extends Parent {
    void print() {
        System.out.println("Two Printing...");
    }
}
class Child2 extends Parent {
    void print() {
        System.out.println("Three Printing...");
    }
}
public class RunTimePolymorphism {
    public static void main(String args[]) {
        Parent p;
        p = new Parent();
            p.print();
        p = new Child1();
            p.print();
        p = new Child2();
            p.print();
    }    
}
