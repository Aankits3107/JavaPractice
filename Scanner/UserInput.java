package Scanner;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("What's your name: ");
        String name = scan.nextLine();
            
            System.out.println("How old are you? ");
        int age = scan.nextInt();
        scan.nextLine();
            System.out.println("Whats your favorite food?");
        String food = scan.nextLine();

            System.out.println("Hello "+ name);
            System.out.println("You are " +age+ " years old");
            System.out.println("You like "+food);

        scan.close();
    }
}
