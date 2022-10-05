interface First {
    public void sleep();
}
interface Second {
    public void sound();
}

class Animal implements First, Second {
    public void sleep(){
        System.out.println("Sleeping zZ.zZ.zZ.");
    }
    public void sound(){
        System.out.println("Making sound...");
    }
}

public class InterfacesExample {
    public static void main(String args[]) {
        Animal a1 = new Animal();
        a1.sleep();
    }
}
