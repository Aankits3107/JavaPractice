package Abstract;

public class Cat extends Animal implements AnimalStuff {
    public void makeNoise() {
        System.out.println("Meaow");
    }

    @Override
    public void poop() {
        System.out.println("Phlbblobpblop");
    }
}
