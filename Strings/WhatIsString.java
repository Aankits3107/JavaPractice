// A reference data type that can store one or more characters
//  Reference data types have access to useful string methods
//

package Strings;

public class WhatIsString {
    public static void main(String[] args) {
       String name = "Ankit";
       boolean result = name.equals("Ankit"); // compare two object.
    //    boolean result = name.equalsIgnoreCase("ankit"); // compare two object, with case sensitivity.
    //    int result = name.length(); // give the size of the object, no of character it has.
    //    char result = name.charAt(0); // give the character at the index no.
    //    int result = name.indexOf("n"); // give the index of no of the character you provide in the string.
    //    boolean result = name.isEmpty(); // check if straing is empty or not.
    //    String result = name.toUpperCase(); // give string to all upper case.
    //    String result = name.toLowerCase(); // give string to all lower case.
    //    String result = name.trim(); //remove all the empty space in the string, before and after the characters (" abcd ").
    //    String result = name.replace('k', 'c'); //replace the character with a old value with new value in the string
        System.out.println(result);
    }
}