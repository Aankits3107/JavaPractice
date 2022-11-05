// A collection.
//Resizable array to store reference data types. Use wrapper class in array list <"WrapperClass">
//Elements can be added or removed from it, after compilation phase.
//with array we use array.lenght() but with array list we use arraylist.size().

package Array;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza"); //add value
        food.add("Burger");
        food.add("Sandwich");

        food.set(0, "Momos"); // change value
        food.remove(2); // remove value
        food.clear(); // clear the array list
        
        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i)); //to display all elements of array list.
        }
    }
}
