class Bike {
    public int gear;
    public int speed;

    public Bike(int gear, int speed) { //constructor with parameters
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBreak(int gear, int speed) {
       // speed -= decrement;
    }
    public void speedUp(int decrement) {
       //speed += increment;
    }
    public String toString() {
        return ("No of gear: " +gear+ "\n" + "Speed of Bike: " +speed);
    }
}
class Dukati extends Bike {
    public int seatHeight;
    public Dukati(int gear, int speed, int StartHeight){
        super(gear, speed);
        seatHeight = StartHeight;
    }
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    @Override
    public String toString(){
        return (super.toString() +"\nSeat Height: " + seatHeight);
    }
}
public class InheritanceExample {
    public static void main(String args[]) {
        Dukati mb = new Dukati(6, 250, 7);
        mb.seatHeight = 15;
            System.out.println(mb.toString());
    }
}
