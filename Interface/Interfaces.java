//You can implements as many interfaces as you can, but can't extends more then one abstract class.
//Every feiled which defined in an interface is static and final. can't change their vales. In abstarct you can change, and they can have therre own values.
//Instead of extends interfaces are implemented. When you implements an inteface then you have to implents the methods from that interface.
//Interfaces - If you have a lot of unrelated classes, that you all want to do a certain thing that makes it so you can garantee that other types of classes will be perform the task if they aren't in a class.

package Interface;

public class Interfaces {
    public static void main(String args[]) {
        Animal a1 = new Animal();
        a1.sleep();
    }
}
