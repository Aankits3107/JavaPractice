package Polymorphism;

public class Dog extends Animal {  

    @Override
    public void eat() { //in polymorphism this eat method will 'override' the eat method from the animal class. Also known as runtime polymorphism
        System.out.println("Chomp Chomp"); //method in a child class overrides an method in it's parent class.
    }
    
    public void eat(int numberOfTimes) { //perameter in a method. - over loading
        for (int i = 0; i< numberOfTimes ; i ++) {
            System.out.println("chomp chomp");
        }
    }

    @Override
    public void makeNoise() {
        //super.makeNoise();
            System.out.println("Wouf Wouf");
    }
}
