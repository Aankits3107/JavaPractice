package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String myString = "Ankit Sharma";
        StringBuffer sbr = new StringBuffer(myString);
        sbr.reverse();
            System.out.println(sbr);
    }
}
