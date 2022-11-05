//Overload - methods that shares the same name but have different parameters
//           method name + parameters = method signature
//Not only are the number of parametrer are taken into account,but also data types of specific parameters.
//Overloaded methods are the methods which have same name, buth different set of parameters.

package Polymorphism;

public abstract class OverloadedMethods {
    public static void main(String[] args) {
        int x = add(1, 2, 3, 4);
            System.out.println(x);
        
        double y = add(2.33, 3.56);
            System.out.println(y);
    }

    static int add(int a, int b){
            System.out.println("This is overload int method 1");
        return a + b;
    }

    static int add(int a, int b, int c){
            System.out.println("This is overload int method 2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d){
            System.out.println("This is overload int method 3");
        return a + b + c + d;
    }

    static double add(double a, double b){
            System.out.println("This is overload double method 1");
        return a + b;
    }

    static double add(double a, double b, double c){
            System.out.println("This is overload double method 2");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d){
            System.out.println("This is overload double method 3");
        return a + b + c + d;
    }
}
