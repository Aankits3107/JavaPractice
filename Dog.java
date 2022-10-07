//a default constructor is always present for a object. Only if user not defined an constructor, java will provide.
//constructor names are aways the same as the class names.
//no return types.
//single argument type and multiple argument type constructors.

public class Dog {
    String name;
    int age;
    public Dog() {
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
}
