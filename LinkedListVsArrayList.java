//LinkedList and ArrayLiost have the same methods.
//Linkedlist - different elements known as node, have pointer/reference to have another node. 1-2-3,...-n.
//The elements are not stored at contiguous memory locations.
//Linkedlist in java is doubly linkedlist.
//Java starts pointer/reference from the begining of the list and the end of the list, but to get to any emenet in the inside of the list, have to follow the pointer/references of all the ements in the list.
//ArrayList have a default size of 10, after that size is reached arraylist automaticaly create a new array of higher size and move all those to elements to the new array.
//ArrayList is faster then linked list in execution of data like getting a specific value.
//LinkedList is more faster to add or remove an element in between the lists, then the arraylist.
//Because linkedlist can add or remove in between elements with the nodes/pointers/references.
//But for an arraylist it have to create a new biggere array (which is emplty in start) then copy the previous array data to to new array by keeping the new value space emplty and in last adding the new value at the emplty space.

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {
    public static void main(String[] args) {
         
        LinkedList<String> namesLinkedList =  new LinkedList<>();
            namesLinkedList.add("Ankit");
            namesLinkedList.add("Sunny");
            namesLinkedList.add("Lion");
            namesLinkedList.add("Lotus");
                System.out.println(namesLinkedList.get(2));
            namesLinkedList.add(1, "Jerry");
                System.out.println(namesLinkedList);

        ArrayList<String> namesArrayList = new ArrayList<>();
            namesArrayList.add("Ankit");
            namesArrayList.add("Sunny");
            namesArrayList.add("Lion");
            namesArrayList.add("Lotus");
                System.out.println(namesArrayList.get(2));
            namesArrayList.add(1, "Jerry");
                System.out.println(namesArrayList);       

    }
}
