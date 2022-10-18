package Super;

public class Animal {
    String name;
    int age;

    public Animal() {
        
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
     
    public void eat() {
        System.out.println("muunch");
    }
    public void makeNoise() {
        System.out.println("Hello, I am an Animal.");
    }
    public String getName() {
        return name;
    }
    public void setName() {
       // this.name = name;
    }
}
