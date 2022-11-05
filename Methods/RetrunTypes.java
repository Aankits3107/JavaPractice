//Retrun types - we can return a value, back to the area known as methods.
//Static - if we want to return a value, with the datatypes we want our values to be returned as.
//void - if not returning anything
//local variables - declaring same variable twice, in main method or in our working mrthod. Its totaly legal to make this, bcz they are same, but different.

package Methods;

public class RetrunTypes {
    public static void main(String[] args) {
        int x = 3;
        int y = 7;
        // int z = add(x, y);
        //     System.out.println(z);
            System.out.println(add(x, y));
    }
    static int add(int x, int y) {
        // int z = x + y;
        // return z;
        return x + y;
    }
}
