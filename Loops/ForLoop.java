// Executes a block of code for a limited amount of times.
// Usually have 3 parts - declaration/index, condition for number of time to execute, increment/decrement a iteration of index (i).
// ++/-- increment or derement by 1,
// i--/i++ will execute counter by 1, like 1, 1, 2, 3, 4 and so on.
// i-=2/i+=2 will execute counter by 2, like 0, 2, 4, 6, 8 and so on.
// the 3rd part of for loop can be moved inside the code block - it work same that way too. Its Optional.

package Loops;

public class ForLoop {
    public static void main(String[] args) {
        for(int i = 10; i >= 0; i-=2) { // declare a counter/index, condition, increment/decrement our index (i)
                System.out.println(i);
            //i--;
        }
        System.out.println("Happy New Year");
    }
}
