abstract class Bank {
   abstract int getRateOfInterest();
}

class SBI extends Bank {
    int getRateOfInterest(){
        return 8;
    }
}
class PNB extends Bank {
    int getRateOfInterest(){
        return 7;
    }
}

public class AbstractExample {
    public static void main(String args[]) {
        Bank b;
        b = new SBI();
        System.out.println("Interest Rate of SBI: " + b.getRateOfInterest() + " %");

        b= new PNB();
        System.out.println("Interset Rate of PNB: " + b.getRateOfInterest() + " %");
    }
}   
