package Generics;

public class GenereicClass {
    public static void main(String[] args) {

        //Approch 1 - 4 different classes
        MyIntegerClass myInt1 = new MyIntegerClass(1);
        MyDoubleClass myDouble1 = new MyDoubleClass(3.14);
        MyCharacterClass myChar1 = new MyCharacterClass('@');
        MyStringClass myString1 = new MyStringClass("Hello");

            System.out.println(myInt1.getValue());
            System.out.println(myDouble1.getValue());
            System.out.println(myChar1.getValue());
            System.out.println(myString1.getValue());


        //Approch 2 - Generic class
        //Single genreric parameter
        // MyGenericClass <Integer> myInt2 = new MyGenericClass <>(1);
        // MyGenericClass <Double> myDouble2 = new MyGenericClass <>(3.14);
        // MyGenericClass <Character> myChar2 = new MyGenericClass <>('@');
        // MyGenericClass <String> myString2 = new MyGenericClass <> ("Hello");

        //Tow genreric parameters
        MyGenericClass <Integer, Integer> myInt2 = new MyGenericClass <>(1, 2);
        MyGenericClass <Double, Double> myDouble2 = new MyGenericClass <>(3.14, 5.45);
        MyGenericClass <Character, Character> myChar2 = new MyGenericClass <>('@', '$');
        MyGenericClass <String, Character> myString2 = new MyGenericClass <> ("Hello", '!');

            System.out.println(myInt2.getValue());
            System.out.println(myDouble2.getValue());
            System.out.println(myChar2.getValue());
            System.out.println(myString2.getValue());
    }
}
