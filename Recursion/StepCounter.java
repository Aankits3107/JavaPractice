package Recursion;

import java.util.Scanner;

public class StepCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("How far do you want to walk (meters) ? :");
        int distance = scan.nextInt();
        scan.close();
        takeAStep(0, distance);
    }

    static void takeAStep(int i, int distance) {
        if(i < distance) {
            i++;
                System.out.println("*You Take a Step*: " + i + " meter/s");
            takeAStep(i, distance);
        } else {
            System.out.println("You are done waling!");
        }
    }
}
