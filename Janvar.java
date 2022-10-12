public class Janvar {
    private String name;
    private String color;
    String naam;
    int ummar;

    public Janvar() {
        
    }
    public Janvar(String naam, int ummar) {
        this.naam = naam;
        this.ummar = ummar;
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
    public String getColor() {
        return color;
    }
    public void setColor() {
       // this.color = color;
    }
}
