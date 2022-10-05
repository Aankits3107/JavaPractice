interface Animal {
    void walk();
    int eye = 2;
}

interface Herbivorse {
    void eat();

}

class Horse implements Animal, Herbivorse { //multiple inheritence - only possible by interface.
    public void walk() {
        System.out.println("Walks on 4 legs.");
    }
    public void eat() {
        System.out.println("Eats Grass");
    }
}

public class OOPS2 {
    public static void main(String args[]){
        Horse h = new Horse();
        h.walk();
    }
}
