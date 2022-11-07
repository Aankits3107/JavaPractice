package StaticKeyword;

public class Friend {

    String name;
    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        numberOfFriends++; //number of time this friend constructor is called when intansitaing a new friend, no of friend count will also increase.
    }

    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends.");
    }

}
