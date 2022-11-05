//objects = an instance of a class that may contain attributes(characterstics which object have) & methods(actions that an object can perform)
//          phone, desk, computer, coffee, cup, car.
//We can have multiple instances of a class.

package OOPS;

public class Oops {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        Car myCar2 = new Car();
            System.out.println(myCar1.make);
            System.out.println(myCar1.model);
        // myCar1.drive();
        // myCar1.breaks();

            System.out.println(myCar2.make);
            System.out.println(myCar2.model);
    }
}
