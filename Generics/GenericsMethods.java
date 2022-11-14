//Genereics - enable types (classes & interfaces) to be parameters when defining:
//                  class, interfaces & methods.
//Advatage - To eiminate the need to create multi versions of methods or classes for various data types
//So basically we can use 1 version for all refernce data types.

package Generics;

public class GenericsMethods {
    public static void main(String[] args) {

        //refrence data types
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        // dispalyArray(intArray);
        // dispalyArray(doubleArray);
        // dispalyArray(charArray);
        // dispalyArray(stringArray);

            System.out.println(getFirst(intArray));
            System.out.println(getFirst(doubleArray));
            System.out.println(getFirst(charArray));
            System.out.println(getFirst(stringArray));

    }
    // //Approch 1. Make different methods to display different types of data types.
    // public static void dispalyArray(Integer[] array) {
    //     for(Integer x : array) {
    //         System.out.print(x + " ");
    //     }
    //         System.out.println();
    // }
    // public static void dispalyArray(Double[] array) {
    //     for(Double x : array) {
    //         System.out.print(x + " ");
    //     }
    //         System.out.println();
    // }
    // public static void dispalyArray(Character[] array) {
    //     for(Character x : array) {
    //         System.out.print(x + " ");
    //     }
    //         System.out.println();
    // }
    // public static void dispalyArray(String[] array) {
    //     for(String x : array) {
    //         System.out.print(x + " ");
    //     }
    //         System.out.println();
    // }

    //Approch 2 - Generic approch
    public static <Thing> void dispalyArray(Thing[] array) { //define <Generic> angle brakets with a name or character 'name cane be anything' before the return type.
        for(Thing x : array) {
            System.out.print(x + " ");
        }
            System.out.println();
    }

    public static <Thing> Thing getFirst(Thing[] array) {
        return array[0]; //to get the first elemets of an array
    }
}
