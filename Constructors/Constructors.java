//a default constructor is always present for a object. Only if user not defined an constructor, java will provide.
//constructor names are aways the same as the class names.
//no return types.
//single argument type and multiple argument type constructors.

package Constructors;

public class Constructors {
    public static void main(String[] args) {
        Dog myDog = new Dog("Jerry",02); //calling a dog constructor method which creating a dog object.
            System.out.println("Name of Dog: "+ myDog.name);
            System.out.println("Age of Dog: " + myDog.age);

            System.out.println("My Dog Name: " + Constants.MY_DOG_NAME);
    }
}
