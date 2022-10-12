//Super - is use to access thing in the parent class/super class you are working in. aka super.
//Can be called from any non-static method in the child class.
//Can also use super to call parent class method which are not override in the sub classes.
//Only be used in the child class to refer to the parent class.
//Can't use to access the private methods of partent class.AS private are onlyt accesable to that class only.
//Can be use to call parent class constructors.
//Calling the super class constructor can only be used in subclass constructor.
//Super call has to be very first line of the constructor.
//If you don't define the super class constructor call in the sub class constructor. Java will autiomaticall call the blank/defalut/n-args constructor of parent class implicitily and automatically with any code.
//If there is no-arg constructor in parent class you will get a error so implement an no-arg constructor or call other parent class constructor - as it  implicitly calls the parent class constructor.
public class SuperDuper {
    public static void main(String[] args) {
        Bille myBille = new Bille("Billota", 2, "fish");
            myBille.makeNoise(); //sublass overridden method
            myBille.eat(); //sub class method
                System.out.println(myBille.naam + " " + myBille.ummar + " " + myBille.catFoodPreference);
    }
}
