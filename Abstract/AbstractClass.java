//An class which you can't instantiate. Can make sub classes of it which you can instantiate.
//Class starts with 'abstract'.
//You can create objects from abstract class.
//Abstarct method - make a method abstarct by adding abstarct keyword in it and they don't have to spacify the body of the body, declare it and end it with a ';'.
//In the child class of the abstract class you have to create an implementatiom of the method.
//Need of abstract method - what the abstarct class does it force and organize exactly what every subclass of the abstract has to have.
//Can have implemented methods as well. - Since they are not abstract they not need to implemet them self they can have use the implementation which already present.
//Difference b/w abstarct & interface - no need for a abstarct keyword to specify a abstract method, it's already abstarct by default.
//      You can implements as many interfaces as you can, but can't extends more then one abstract class.
//      Every filed which defined in an interface is static and final. can't change their vales. In abstarct you can change, and they can have therre own values.
//      Instead of extends interfaces are implemented. When you implements an inteface then you have to implents the methods from that interface.
//Anstarct class - if you have a lot of closely related classes inwhich you want to have same funtionality & same types of fileds available.
//Interfaces - If you have a lot of unrelated classes, that you all want to do a certain thing that makes it so you can garantee that other types of classes will be perform the task if they aren't in a class.

package Abstract;


public class AbstractClass {
    public static void main(String[] args) {
        Cat myCat = new Cat();
            myCat.makeNoise();
    }
}
