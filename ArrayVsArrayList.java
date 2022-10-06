//Array
//Collection or storing same type of object is called an array.
//Can hold primitive data types.
//Fix size, can't grow or shrink from that number. Always have those number of elements in it, which you declare.
//Data stored at indexes.

//ArrayList
//Have dimond operators <>, then ().
//Can only hold objects not primitive data types. - Can be dome with wrapper class. ex: Integer for int, Long for long, Boolean for boolean.
//Didn't have to specify a size, don't have a fix size. Grow and shrink automatically as per need.
//Data stroed at indexes.
//implement toString method.

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        String[] friendsArray = {"John", "Ankit", "Eric", "Sunny"};

        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("John", "Ankit", "Eric", "Sunny"));
    
            System.out.println(friendsArray[1]); // print 2nd element.

            System.out.println(friendsArrayList.get(1)); // print 2nd element.

            System.out.println(friendsArray.length); //get the size/length of array

            System.out.println(friendsArrayList.size()); //get the size/length of arrayList

        //in array can't add or remove.
        friendsArrayList.add("Poou"); //add new elemnt at the lat of list.
            System.out.println(friendsArrayList.get(4));

        friendsArray[0] = "Lion"; //change an element at 1st place.
            System.out.println(friendsArray[0]);

        friendsArrayList.set(0, "Lion"); //change an element at 1st place.
            System.out.println(friendsArrayList.get(0));

        //can't remove or add in array.
        friendsArrayList.remove("Ankit"); //remove an element - either by object (name, value) directly or by its index no.
            System.out.println(friendsArrayList.get(1));

            System.err.println(friendsArray); //gives memory address for printing. Or implemt a for loop for all iterations.

            System.err.println(friendsArrayList); //gives toString metho for printing. Thats it for priniting

    }
}