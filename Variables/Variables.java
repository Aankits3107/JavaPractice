//Local variables - declared inside a method
//                  visible only to that method
//Global variable - declared outside a method, but within a class
//                  visible to all parts of the class

package Variables;

public class Variables {
    public static void main(String[] args) {
        DiceRoller diceRoller = new DiceRoller();
        diceRoller.roll(); // no need to invoke the method here as its done in the constructor call. Though we can also invoke it here but it will call twice.
                           // either invoke here or in constructor to call only once.
    }
}
