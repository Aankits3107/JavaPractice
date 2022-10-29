package MathClass;

public class MathClass {
    public static void main(String[] args) {
        double a = 3.14;
        double b = -10;
        double c = Math.max(a, b);
        double d = Math.min(a, b);
        //absalute value
        double e = Math.abs(b);
        //square root
        double f = Math.sqrt(a);
        //round figures
        double g = Math.round(a); //round figure
        double h = Math.ceil(a); //round up value
        double i = Math.floor(a); //round down
            System.out.println("Max value: " +c);
            System.out.println("Min value: " +d);
            System.out.println("Absalute value: " +e);
            System.out.println("Square root value: " +f);
            System.out.println("Round value: " +g);
            System.out.println("Celing value: " +h);
            System.out.println("Floor value: " +i);
    }
}
