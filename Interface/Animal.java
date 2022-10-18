package Interface;

public class Animal implements Sound, Sleep {
    public void sleep(){
        System.out.println("Sleeping zZ.zZ.zZ.");
    }
    public void sound(){
        System.out.println("Making sound...");
    }
}
