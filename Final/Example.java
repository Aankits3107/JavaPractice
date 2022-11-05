//Anything is declared final can not be later changed or updated in your program
//Comman practice to declare final variable is all-caps. Not necessary though.

package Final;

public class Example {
    public static void main(String[] args) {
        final double PI = 3.14159;
        //pi = 4; // can't update variable value after declaring it as final.
            System.out.println(PI);
    }
}
