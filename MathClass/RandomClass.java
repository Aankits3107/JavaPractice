//usefull in game decision making codes.
package MathClass;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random(); //not true random number, but sudo random numbers

        int x  = random.nextInt(6); //by passing value in this we can limiting the random number range.
            System.out.println("Random value of X: " +x);

        double y = random.nextDouble();
            System.out.println("Random value for Y: "  +y);

        boolean z = random.nextBoolean();
            System.out.println("Random value for Z: " +z);
    }
}
