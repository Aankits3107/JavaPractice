// Provides a way to use primitive data types as refernce data types.
//  reference data types contain usefull methods
//    can be used with collections eg: ArrayList
// Reference data types are slower to access, then the primitive data types.

//  primitive  //  wrapper
//  ---------  //  -------
//   boolean       Boolean
//   char          Character
//   int           Integer
//   double        Double
 
// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

package WrapperClasses;

public class Wrapper {
    public static void main(String[] args) {
        //autoboxing
        Boolean a = true;
        Character b = '@';
        Integer c  = 123;
        Double d = 3.14519;
        String e = "Ankit";

        //unboxing
        if(a == true) {
            System.out.println("This is True");
        }
    }
}
