//While loop - Execute a block of code as long as its condition remains true. first check the condition then execute the block of code.
//Kinda like if statement as long as its condition is true, ity will continue to execute.
//Do-While loop - condition at end of block of code, in start of block we define DO. So first the block code run once and compare it against the condition, then repeat until condistion is satisfied. 

package WhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "";
        //while loop
        // while(name.isEmpty()) { //condition for looping
        //         System.out.println("Enter you name: ");
        //     name = scan.nextLine(); //assign vale to object.
        // }

        //do while loop
        do {
                System.out.println("Enter you name: ");
            name = scan.nextLine(); 
        }
        while(name.isEmpty());

            System.out.println("Hello " +name);
        scan.close();
    }
}
