// A modifier.
// A single copy of a variable/method is created & shared.
// The class 'owns' the static member - Variable or objects. And its shared with all instances of the class.

package StaticKeyword;

public class StaticKeyword {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Sponge Bob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");
            System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
    }
}