package This;

public class Dog {
    private String name;
    private int age;
    String naam;
    int ummar;

    public void setName(String name) {
       this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
       this.age = age;
    }
    public int getAgee() {
        return this.age;
    }

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
