//Constructor - A special method that is called when an object is instantiated/created
//              Assign different attrubutes to each object we instanciate
// Default constructors - created by java it self
//Custom contructotrs - created by programers
//Parametrized constructors - created by programers with parameters & attributes.

package Constructors;

public class Example {
    public static void main(String[] args) {
        Human human1 = new Human("Ankit", 29, 77.5); //here an constructor is created behind the scenes which java automatically created and is hidden, when a object is instantiated/created.  
        Human human2 = new Human("Sunny", 28, 76.2);
            // System.out.println(human1.name);
            // System.out.println(human2.name);
        human1.eating();
        human2.drinking();
    }
}
