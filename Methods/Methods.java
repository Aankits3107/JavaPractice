// Method - block of code that is executed whenever it is called upon.
// custom methods - to write outside the main method, & called/invoke inside main method
// can not make a static refernce to a non static method from the type main.
// When values passes in method's() they called be parameters, and they require matching set of data types in the invoking/call of methods which are called arguments.
//  It can be n number of parameters and arrugements in a method as long as they have same datatypes, in correct sequence order.

package Methods;

public class Methods {
    public static void main(String[] args) {
        String name = "Ankit";
        int age = 29;
        hello(name, age); // we can pass value or variable in methods. this is a argument , not parameters.
    }

    static void hello(String title, int age) { //normally we don't add this keyword.
        System.out.println("Hello " + title + "\nYou are " + age + " years old.");
    }

}
