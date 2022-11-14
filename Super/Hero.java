package Super;

public class Hero extends Person{
    String power;

    Hero(String name, int age, String power) { //constructor
        super(name, age); //refering to parent class(Person class) variables.
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + this.power; //caling parent class method
    }
}