package MathClass;

import java.util.Scanner;

public class Hypotenuse {
   public static void main(String[] args) {
    double x;
    double y;
    double z;

    //value of x
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter side X: ");
    x = scan.nextDouble();

    //value of y
        System.out.println("Enter side Y: ");
    y = scan.nextDouble();

    //Hypotenuse formula
    z = Math.sqrt((x*x)+(y*y));
        System.out.println("The Hypotenuse is: " +z);

    scan.close();
   } 
}
