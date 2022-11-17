//Lambda Expression


//                          Annonymiys Inner Class                                                    //                        Lambda Expression
//      A class without name                                                                          //      It is a function without name(annonymous function)
//      Can extend abstract & concrete classes                                                        //      Can't extend abstarct & concrete classes
//      Can implement an interface that contain any number of abstarct method                         //      It implements an interface with single abstarct method(functional inetrface)
//      We can declare instance cariable in it.                                                       //      We can't declare instace variable in it. whatever veriables are declared are considered as local variable
//      They can be instantiated                                                                      //      They can't be instatiatated
//      'This' always refer to current annonynous inner class object but not outter class object      //      'This' alsways represent current outter class object
//      Best choice when we handle multiple methods                                                   //      Best choice to handle interface with singke abstarct methods
//      A seprate .class file is generated internaly at complie time                                  //      At time of compilation no seprate .class file is generated
//      Memory will allocated on demand, whenever we create object.                                   //      Reside in permanent memory of JVM (method area)

// Annonymous Inner class are not equal to Lambda expression

// Advantages:
// To enable functional programming in java - u can use procedure directly, send procedure and arrgument in java.
// Write more readable maintainable & clean consisable code.
// To use APIs very easily & effectively
// To eanble perallel programming
// Reduce complexity of anonymous inner class until some extent
// we can handle function / procedure jult like values
// We can pass function / procedure as argument

// We can access enclosing class & method variable sdirectly.
// From lam.ex it is possible to access enclosing class level variables.
// From lam.ex it is possible to access local variables of enclosing methods.
// But local variables which are refernced from lam.ex must be final or effectively final. Hence within the lam.ex or outside the lam.ex you can't change the value of local variables which are referned from lam.ex.

package Lambda;

interface Interf {
    public void m1();
}

public class LambdaByDurga {
    int x = 10;
    public void m2() {
        int y = 20; // local variable for m2
        Interf i = ()-> { 
                        //   x = 28347; //changing vales. since x is not locale variable of m2 method
                        //   y = 876; // can;t change y.
                          System.out.println(x); System.out.println(y);
                        };  //within the lam.ex the value of y is fixed for this expression. The local variables which are referenced from lam.ex are final, are effectively declared final. we can't change its value outside or inside the lam.ex.
        i.m1();
    }
    public static void main(String[] args) {
        LambdaByDurga t = new LambdaByDurga();
        t.m2();
    }
}

// Intref i = () -> System.out.println("Hello");
//            ---------------------------------- passing a function in lam.ex directly as a value.
// Thread t = new Thread( ()-> { System.out.println("Child Thread"); } );
//                      ------------------------------------------------- passing procedure directly to a method as a argument.