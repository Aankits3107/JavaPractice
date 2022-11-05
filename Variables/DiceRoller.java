package Variables;
 //error: as random & number both are local variable to the constructor DiceRoller, they are not accessibale here. To solve this either declare them globaly in the class or pass them as arrgument & parameters in the method where its called upon.

import java.util.Random;

public class DiceRoller {

// Local Variable - Arrgument & Perameter approch
    // DiceRoller() {
    //     Random random = new Random();
    //     int number = 0;
    //     roll(random, number);
    // }

    // void roll(Random random, int number) {
    //     number = random.nextInt(6)+1; // adding +1 because we get number s fro 0 to 5
    //         System.out.println(number);
    // }

// Globle variable approch
    Random random;
    int number;

    DiceRoller() {
        random = new Random();
        //roll();
    }

    void roll() {
        number = random.nextInt(6)+1;
            System.out.println(number);
    }

}
