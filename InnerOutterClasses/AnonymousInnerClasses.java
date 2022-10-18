//A class with no name, that you use to instantiate only one object ever.
//Whenever you use this class you always be defining that class & instantiating the single object of that class at the same time in same java statement.
//It can extend an existing class or implement any existing interface.
//      Can be made by 2 different ways 1st by extending a class by creating a subclass of an existing class and 2nd by impementing an interface.
//One time use only. Can't instantiate again.
//

package InnerOutterClasses;

public class AnonymousInnerClasses {
    public static void main(String[] args) {
        //extends a class
        Animal myAnimal = new Animal();
        myAnimal.makeNoise();

        Animal bigFoot = new Animal() { //this how we create a anonymus subclass of animal class. And writing that class defination in these curly braces.
                                        //It's look like we are create an object of type runnable runnable but we are actually creating a object of class type that dosn't have a name.
            @Override
            public void makeNoise() {  //we can override this make noise method with our own implementation.
                System.out.println("Grwalneenlnenlengehehe");
            }
        };
        bigFoot.makeNoise(); //allow you to crate an unnamed subclass of someother class like animal & create one single object of that anonymous class
    
        Runnable myAnonymousRunnable = new Runnable() { //Runnable uis not a class its and java interface. and we can make a anonymous class of the runnable here to make it as implemnted Anonymous class.
                                                        //It's look like we are create an object of type runnable runnable but we are actually creating a object of class type that dosn't have a name.
            @Override
            public void run() {
                System.out.println("I'm an Anonymous Runnable.");
            }
        };
        myAnonymousRunnable.run();
    }
}
