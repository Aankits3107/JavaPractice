//Polymorphism - many shapes, may forms.
//Your classes can do same thing in different ways.
//Method Overriding - Run time - Method in a child class overrides an method in it's parent class. Doing a same thing in a different way.
//Method overloading - complie time - two methods in a class have same name but different parameters.
public class Polymorphism {
    public static void main(String[] args) {
        Janvar myJanvar = new Janvar();
        myJanvar.eat();

        Kutta myKutta = new Kutta();
        myKutta.eat(); //overriding
        myKutta.eat(3); //overloading

        Bille mybBille = new Bille();
        mybBille.eat();
    }
}
