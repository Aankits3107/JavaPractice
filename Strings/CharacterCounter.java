package Strings;

public class CharacterCounter {
    public static void main(String[] args) {
        String string = "Hi My Name is Ankit Sharma";
        int count = 0;
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ') {
                count++;
            }
        }
            System.out.println("Total no of charcter: " + count);
    }
}
