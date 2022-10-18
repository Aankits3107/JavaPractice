//Refer to the current object - Meaning it refers to object that the method you are currently in was called on.
//Not allowed to be used in any static methods - Static methods can be used outside the contect of a class without need of any perticular object.
//  Since 'this' refers to the object this method is called upon using in a static method don't make sence so not allowed.
//Can be use inside constructor methods to call other constructor methods. - This call has to be a very first statememt in your constructor.
//  If not very first line you will get an error. Can't used beside a constructor. Because this staement call actually creates the object, and java don't want that any other line of code uses that statements before its object is created.

package This;

public class WhatIsThis {
    public static void main(String[] args) {
    Dog myDog = new Dog();
        myDog.setName("MarshMellow");
            System.out.println(myDog.getName());
    }
}