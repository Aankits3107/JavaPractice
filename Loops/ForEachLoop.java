//for-each - traversing technique to iterate through the elements in an array/collection.
// advantage - less stpes, more redable than normal for loop.
// disadvantage - less flexible
// also called enhanced for loop.

package Loops;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
       //String[] animals = {"Cat", "Dog", "Rat", "Bird"};  // array
        ArrayList<String> animals = new ArrayList<>(); //collection
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rat");
        animals.add("Bird");
       for(String i : animals) {  // data types with index, ':' means inside, array/collection name
                                  // for every string index in our array/collect
            System.out.println(i);
       }
    }
}
