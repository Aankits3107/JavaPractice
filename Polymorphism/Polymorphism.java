//Polymorphism - many shapes, may forms.
//Your classes can do same thing in different ways.
//Method Overriding - Run time - Method in a child class overrides an method in it's parent class. Doing a same thing in a different way.
//Method overloading - complie time - two methods in a class have same name but different parameters.

package Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();

        Dog myDog = new Dog();
        myDog.eat(); //overriding
        myDog.eat(3); //overloading

        Cat myCat = new Cat();
        myCat.eat();
    }
}