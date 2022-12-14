//Final - in class - prevents other class to be a subclass of the patent class.
//  Class not to be extended b y other classes.
//Final - in method - a sublass can't override a method which is final in the parent class.
//Final - as variable - a variable that is assigned only one time.
//  To create constants. Constants are declared at the start of the code right below the class declaration and outside any method.
//  Constant name are in upper cases if single word and for multi word seprated by underscore.

package Final;

public class FinalExample {
    public static final double PI = 3.14159; // constant
    public static void main(String[] args) {
        // Dog myDog = new Dog();
        final Dog myDog; //final variable
        myDog = new Dog(); //instantiating into a different line, once assigned cant be assigned again.
        myDog.eat();  
        
        // final double pi = 3.14159; // final value
            System.out.println(PI*3);
    }
}
