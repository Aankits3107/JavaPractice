//toString() - special method that all objects inherit, this return a string that "textually represents" an object
//             can be used in both implicitly & explicitly.

package Strings;

public class ToStrings {
    public static void main(String[] args) {
        Car car = new Car();
            // System.out.println(car.make + ", " + car.model + ", " + car.color + ", " + car.year); //
            // System.out.println(car); // System.out.println(car.toString()); // returns the address of the object in computer memory.
            
            // explicit
            System.out.println(car.toString()); //overriden toString method.

            // implicitly
            System.out.println(car);
    }
}
