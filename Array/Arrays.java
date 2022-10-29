// An array is a special variable, which can hold more than one value, of same data type.
// have values in form of indexes. Array of size 2 will have 3 values, as indexes start from 0. so the arrays will look like 0, 1, 2.
// Common error - arrayOutOfBoundException. when we trying to fetch an index number which is higher then the size of array itself
//

package Array;

public class Arrays {
    public static void main(String[] args) {
        //can be defined in two ways. 1.
        String[] cars = {"Camero", "Mustang", "Corvette", "Tesla"};
            cars[0] = "Maruti"; //set new value at this index number.
                System.out.println(cars[2]);

        // 2.
        String[] bikes = new String[3];
            bikes[0] = "Triumph";
            bikes[1] = "Suzuki";
            bikes[2] = "Harley Davidson";

        //displaying all elements use a loop.
        for(int i = 0; i < bikes.length; i++) {
                System.out.println(bikes[i]);
        }
    }
}
