//Inner classes are also called nested classes. A class which is defined inside a class.
//can have data types, methods, classes.
//Used in very larger applications. In case where a certain were class that only ever make sence anyweher only in side of another class.

public class MainClass {
    public static void main(String[] args) {
        OutterClass outter = new OutterClass();
            outter.heyThere();
        OutterClass.InnerClassNonStatic innerNonStatic = outter.new InnerClassNonStatic(); //to call the inner class of the outter class, we have to call the constructor to make a inner class variable.
            innerNonStatic.WhatsUp();
        OutterClass.InnerClassStatic innerStatic = new OutterClass.InnerClassStatic(); //to call the inner class of the outter class, we have to call the constructor to make a inner class variable.
            innerStatic.WhatsUp();
    }
}
