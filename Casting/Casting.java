//Casting - usCasting - when you take an object and cast to it super class/ parent calss.
//        - downCasting - cast it to child class/subclass.
//All subclass can be upcast to parent class.
//
package Casting;

public class Casting {
    public static void main(String[] args){
     Animal myJanvar = new Dog(); //upcasting - since kutta is subcvlass of janver. 'myJanvar' is called reference type is such case.
         doAnimalStuff(myJanvar); //anysubclass is valid to call such method call.
 
    }
    
    public static void doAnimalStuff(Animal animal) { //this method call in up casting will always do right type of calling for any subclass methods reference provided into it.
        animal.makeNoise(); //this method dosn't know which subtype of animal it's working with you can't use any of the methods that are only in those subclasses
     if (animal instanceof Dog) { //to avaoid class cast exception use 'instanceof' to verify.
         Dog myDog = (Dog)animal;
         myDog.growl();
     }
    }
 }
 