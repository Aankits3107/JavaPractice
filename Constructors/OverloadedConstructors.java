//Multiple constructors within a class with the same name, but have different parameters
//          method signature = name + parameters

package Constructors;

public class OverloadedConstructors {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Thin crust", "Tamato", "Mozzerella", "Peperroni");
            System.out.println("Here are the ingredients of your pizza 1: Bread- " + pizza1.braed + ", Sauce-  " + pizza1.sauce + ", Cheese-  " + pizza1.cheese + ", Topping- " + pizza1.topping);
    
        Pizza pizza2 = new Pizza("Thick crust", "Tamato", "Mozzerella");
            System.out.println("Here are the ingredients of your pizza 2: Bread- " + pizza2.braed + ", Sauce- " + pizza2.sauce + ", Cheese- " + pizza2.cheese);

        Pizza pizza3 = new Pizza("Cheeseburst", "Tamato");
            System.out.println("Here are the ingredients of your pizza 3: Bread- " + pizza3.braed + ", Sauce- " + pizza3.sauce);

        Pizza pizza4 = new Pizza("Plain");
            System.out.println("Here are the ingredients of your pizza 4: Bread- " + pizza4.braed);
    }
}
