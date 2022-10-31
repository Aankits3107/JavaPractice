// 2D Arraylist - A dynamic list of lists.
// During run time, w ecan change the size of the lsit.

package Array;

import java.util.*;

public class TwoDeArrayListExample {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList(); // syntax of 2d array list

        ArrayList<String> backeryList = new ArrayList<>();
        backeryList.add("Pasta");
        backeryList.add("Bread");
        backeryList.add("Pancakes");
            System.out.println(backeryList.get(0)); // to display element at a certain index no.
        
        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Tamatoes");
        produceList.add("Peppers");
        produceList.add("Patetoes");
            System.out.println(produceList.get(0)); // to display element at a certain index no.

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Soda");
        drinksList.add("Coffee");
            System.out.println(drinksList.get(0)); // to display element at a certain index no.

        groceryList.add(produceList);
        groceryList.add(backeryList);
        groceryList.add(drinksList);
            System.out.println(groceryList); // to display the 2d array list
            System.out.println(groceryList.get(0)); // to display a list at certain index number of 2 d array list
            System.out.println(groceryList.get(0).get(0)); // to display certain elemt of a certain array list at a certain index no.
    }
}
