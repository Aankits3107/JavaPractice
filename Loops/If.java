//to perform a block og code if it's condition evaluate to be ture.
//very basic statement for decision making
// > -greater than , < -lesser than , == -comparing two object --Comparision operators
// = -seting a value --asssigning operator

package Loops;

public class If {
    public static void main(String[] args) {
        int age = 75;

        if(age  >= 75) {
            System.out.println("OK Boomer");
        }
        else if(age >= 18) {
            System.out.println("You are an Adult!");
        }
        else if(age >= 13) {
            System.out.println("You are an Teenager!");
        }
        else {
            System.out.println("You are not an Adult!");
        }
    }
}
