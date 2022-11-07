//Overriding - Declaring a method in sub-class, which is already present in parent class.
//              So that a child class can give its own implementations to it.

package Polymorphism;

public class OverridingingMethods {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
    }
}
