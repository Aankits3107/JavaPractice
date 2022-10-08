import org.omg.CORBA.SystemException;

public class OutterClass {
    int number = 6;

    public void heyThere() {
            System.out.println("Hey there!");

    //method local inner class - only accesable in this method only. not asseable anywhere else exept here.
    class LocalInnerClass {
        String localInnerClassVariable = "Here's johnny.";

        public void printLocalInnerClasssVariable() {
                System.out.println(localInnerClassVariable);
        }
    }

    LocalInnerClass lic = new LocalInnerClass();
    lic.printLocalInnerClasssVariable();

    }
    //non-static inner class.
    public class InnerClassNonStatic {
        int innerNumber = 8;
        public void WhatsUp() {
                System.out.println("WassUp!, from the non-static inner class.");
        }
    }

    //static inner class
    public static class InnerClassStatic {
        int innerNumber = 10;
        public void WhatsUp() {
                System.out.println("WassUp!, from the static inner class.");
        }
    }
}
