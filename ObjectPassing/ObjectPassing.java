//Pass objects as arrguments to a method but when you declare that method, you have to have the parameters setup to accept objects of that data types.

package ObjectPassing;

public class ObjectPassing {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car("BMW"); //passed object as arrguments here.
        Car car2 = new Car("Mercedes");
        garage.park(car1);
        garage.park(car2);
    }
}