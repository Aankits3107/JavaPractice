package Super;

public class Cat extends Animal{
    String catFoodPreference;

    public Cat() {
        
    }
    public Cat(String name, int age, String catFoodPreference) {
        super(name, age);
        this.catFoodPreference = catFoodPreference;
    }

    public void eat() { //in polymorphism this eat method will 'override' the eat method from the animal class. Also known as runtime polymorphism
        System.out.println("nom nom nom"); //method in a child class overrides an method in it's parent class.
    }

    @Override
    public void makeNoise() {
        //super.makeNoise(); //parent class/super class method will be called first. as super is called.
            System.out.println("Meoa Meow Meow");
        //eat(); //can be used without(super keyword) super class implementation. Because this class isn't overriding the super class's implementaion of the eat method. By default jus calling eat will get us the animal class implementation of parent class implementations.
    }
}
