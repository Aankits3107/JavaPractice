public class Bille extends Janvar{
    private String litterPreference;
    
    public void eat() { //in polymorphism this eat method will 'override' the eat method from the animal class. Also known as runtime polymorphism
        System.out.println("nom nom nom"); //method in a child class overrides an method in it's parent class.
    }

    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }
}
