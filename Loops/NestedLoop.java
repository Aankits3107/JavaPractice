// Loop within a loop

package Loops;

import java.util.Scanner;

public class NestedLoop {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int rows;
    int columns;
    String symbol = "";

        //rows
            System.out.println("Enter number of rows: ");
        rows = scan.nextInt();
    
        //columns
            System.out.println("Enter number of columns: ");
        columns = scan.nextInt();

        //symbol
            System.out.println("Enter symbol to use: ");
        symbol = scan.next();

        //for example using for loops - outerloop - rows and innerloop - columns
        for(int i = 1; i <= rows; i++) { //outer loop for rows
                System.out.println();
            for(int j = 1; j <= columns; j++) { //inner loop for columns
                    System.out.print(symbol);
            }
        }
        scan.close();
   } 
}
