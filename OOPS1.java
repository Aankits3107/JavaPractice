abstract class Animal {
    Animal(){
        System.out.println("You are creating a Animal.");
    }
    abstract void walk();
    public void eat() {
        System.out.println("Animal Eats.");
    }
}
class Horse extends Animal {
    Horse(){
        System.out.println("Created a Horse.");
    }
    public void walk() {
        System.out.println("    Walks on 4 legs.");
    }
    public void eat() {
        System.out.println("        Eats Grass");
    }
}
class Chicken extends Animal {
    Chicken(){
        System.out.println("Created a Chicken.");
    }
    public void walk() {
        System.out.println("    Walks on 2 legs.");
    }
    public void eat() {
        System.out.println("        Eats Seeds");
    }

}

public class OOPS1 {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
        
        Chicken c1 = new Chicken();
        c1.walk();
        c1.eat();;
    }
}
