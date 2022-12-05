//Tells the exception name as exception in thread: followed by its name & description and its stack trace i.e. what methods called by which method and etc etc till main method.
//Works in jvm by default, no need for a defining the exception handling for this.

package ExceptionHandling;

public class DefaultExceptionHandling {
  public static void main(String[] args) {
    doStuff();
  }
  public static void doStuff() {
    doMoreStuff();
    // System.out.println(10/0);
  }
  public static void doMoreStuff() {
        System.out.println("Doing More Stuff");
        // System.out.println(10/0);
  }
}
