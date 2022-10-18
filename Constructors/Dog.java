package Constructors;

public class Dog {
    String name;
    int age;

    public Dog() {
        this("Kutta", 2);
    }
    public Dog(String name) {
        this.name = name;
    }
    public Dog(int age) {
        this.age = age;
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void bark() {
        System.out.println("Bark !");
    }
}

