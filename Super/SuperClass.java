//'Supe'r keyword refers to the superclass/parent class of an object. Very similar to 'this' keyword.
//'this' refers to subclass/child class, 'super' refers to parent class class.
//'Super' keyword use to call a method in super/parent class
package Super;

public class SuperClass {
    public static void main(String[] args) {
       Hero hero1 = new Hero("Batman", 40, "$$$"); 
       Hero hero2 = new Hero("Superman", 38, "Kryptonian"); 
        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
    }
}