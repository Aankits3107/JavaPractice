//Recursion - Is when you have a method that calls it self.
// - stack-over-flow error. Infinite loop error.
//Usefull in case for factorials, transversing trees, & simplifying a complex task.
//Keeps calling a method over m over.
//Add paramenters to handle recursion.
//Exit stratergy - 1. Base case - a condition inside a method where it can return with making a recursive call.
//                      make your condition to move towrd the base case, to stop it from infinite loop.
//                          java call stack memory not large enough to hold a very large count for method calls in stack.
//                 2. Regular iteration with a for loop.

package Recursion;

public class RecursionTutorial {
    public static void main(String[] args) {
        sayHi(3);
    }
    private static void sayHi(int count) {
            System.out.println("Hi!");
        if(count <= 1) { //base case.
            return; //base case.
        }
        sayHi(count -1); //recursive method calling. condition allow to make recursion towards a base case condition.
    }
}
