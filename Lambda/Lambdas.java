//Only be used in certain types of interfaces.
//Kind of like a contarcty that any class that implements that interface has to provide their own implementationsof the methods specify in that interface.
//Instead of passing in the object that contains a specific implementation of the  method, we're just passing in the specific implementaion of the method directly.
//Access level don't require (public, protectd, etc.), method name also not require - only need what it does. Don't require a return type too bcz the complier can figure the return type automatically.
//Only need is the prametres and the actuall method implementaions. And the arrow operators ->
//Basically instead of sending in the object which contains the action we are directly sending in the action itself. 
//If the lambda expression is just one line we can directly send the line of code.
//Lambda in java give the ability to make the method implementation into objects like any other that can be saved in to variables and passed into methods as parameters.
//If your lambda expression has one parameter then no need to provide braces( ), but if more that one then require braces for the parameters.
//When amethod inside an interface has no implementation it is called an abstarct method.
//      and when an intercae hase one abstarct method it's called an functional interface.
//      also called SAM single abstract method.
//Lambda can only be use in a contect of a functional interface.
//      a shortcut to define and implenets an functional interface.
package Lambda;

public class Lambdas {
    public static void main(String[] args) {
        Printable lambdaPrintable = (p, s) -> System.out.println("Meow " + p + s);
            printThing(lambdaPrintable);

        Printable2 lambdaPrinter = (suffix) -> "Meowzaaa " + suffix;
            pokerThing(lambdaPrinter);
    }

    static void printThing(Printable thing) {
        thing.print("!", ".");
    }

    static void pokerThing(Printable2 things) {
        things.printing("!");
    }
}