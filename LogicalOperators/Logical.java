//Use to connect two or more expressions
// && = AND, Both Conditions must be ture
// || = OR, either condition must be true
// ! = NOT, reverse boolean value of condition

package LogicalOperators;

import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {

    // && AND
        int tempInDegree = 25;
        if(tempInDegree > 30) {
            System.out.println("It is Hot outside.");
        }
        else if(tempInDegree >= 20 && tempInDegree <= 30) {
            System.out.println("It is Warm outside.");
        }
        else {
            System.out.println("It is Cold outside.");
        }

    // || OR
        Scanner scanner = new Scanner(System.in);
            System.out.println("You are playing a game! Press q OR Q to quit");
        String responses = scanner.next();
        if(responses.equals("q") || responses.equals("Q")) {
            System.out.println("You quit the game.");
        }
        else {
            System.out.println("You are still playing the game *pew pew*");
        }
        scanner.close();

    // ! NOT
        Scanner scan = new Scanner(System.in);
            System.out.println("You are playing a game! Press q OR Q to quit");
        String response = scan.next();
        if(!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game *pew pew*");
        }
        else {
            System.out.println("You quit the game.");
        }
        scan.close();
    }
}
