//A statement that allows a variable to be tested for equality against a list of values
//more efficent to use switch in case of a lots of if statements.
//Based on cases, and to finish a case use break keyword to finish the switch or to jump to next case.
//If there is no break case then code will perform the action on the matching case and with out the break code will execute all the case which came after the match.
//Have a default case just like ELSE.
package Switch;

public class Switch {
    public static void main(String[] args) {
     String day = "Pizza";     
        switch(day) {
            case "Sunday": System.out.println("It is Sunday!");
                break;
            case "Monday": System.out.println("It is Monday!");
                break;
            case "Tuesday": System.out.println("It is Tuesday!");
                break;
            case "Wednesday": System.out.println("It is Wednesday!");
                break;
            case "Thursday": System.out.println("It is Thursday!");
                break;
            case "Friday": System.out.println("It is Friday!");
                break;
            case "Saturday": System.out.println("It is Saturday!");
                break;
            default: System.out.println("This is not a day.");
        }
    }
}
