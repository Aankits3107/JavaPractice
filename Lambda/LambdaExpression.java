//Lambda expression - feature in java 8 abd above. Also known as an 'annonymous method'
//                    a short way to write annonymous classes with only one method.
//Need to use a functional interface or use a pre-defined functional.
//      They contain only one abstract method. ex - ActionListner, Runnables, user-defined interface
//A lambda expression can be used in any place where a functional interface is required.
// syntax - (arguments) -> {statement/s}


package Lambda;

public class LambdaExpression {
    public static void main(String[] args) {
        String name = "Ankit Sharma";
        char symbol = '!';

        // MyInterface myInterface = new MyInterface() {
        //     public void message() {

        //     }
        // };

        //single statement
        // MyInterface myInterface = () -> System.out.println("Hello World");
        // myInterface.message();

        //multistatment
        MyInterface myInterface1 = (n, s) -> {
                                               System.out.println("Hello World");
                                               System.out.println("It is a nice day " + n + s);
        }; //in argument can't re-declare a local variable so give anything you like.
        myInterface1.message(name, symbol);

        MyInterface myInterface2 = (n, s) -> {
                                                System.out.println("Hello" + n + s);
         };
        myInterface2.message(name, symbol);

        MyFrame myFrame = new MyFrame();

    }
}
