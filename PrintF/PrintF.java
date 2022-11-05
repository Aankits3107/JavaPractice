//printf() - an optional method to control, format & display text to the console window
//           two arguments = format string + object/varialble/value
//           %[flags] [precision] [width] [conversion-character]
// d = decimal, b = boolean, s = string, d = also int, f = floats/doubles

package PrintF;

public class PrintF {
    public static void main(String[] args) {

        // System.out.printf("This is a format string %d", 123);
        // System.out.printf("\n%d This is a format string", 123);

    boolean myboolean = true;
    char myChar = '@';
    String myString = "Ankit";
    int myInt = 50;
    double myDouble = 10000000;

    // [conversion-character]
    // matching conversion-character which follows the %letter, to display the certain value
        System.out.printf("%b", myboolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

    // [width]
    // minimum number of character to be written as output
        System.out.printf("Hello %1s",myString); //distance between two values(spaces)

    // [precision]
    // sets number of digits of precision when outtputting floating-point values
        System.out.printf("You have this much money %.2f ", myDouble); // seting a decimal limit after the double's decimal(by default double will dshow 6 decimal dogits, it it contain decimal digit or not)

    // [flags]
    // adds an effect to output based on the flag added to format specifier
    // - : left-justify
    // + : output a plus(+) or minus(-) sign for a numeric value
    // 0 : numeric values are zero-padded
    // , : comma grouping seprator if numbers > 1000
        System.out.printf("You have this much money %,f ", myDouble);

    }
}
