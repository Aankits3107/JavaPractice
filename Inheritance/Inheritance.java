// The process where one class aquires, the attributes/methods of another.
// Parent-child class.
// usage - when you have more classes to work with, increase reusability.

package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();
            System.out.println(car.speed);
            System.out.println(car.doors);

        Bicycle bike = new Bicycle();
        bike.stop();
            System.out.println(bike.speed);
            System.out.println(bike.pedals);
    }
}
