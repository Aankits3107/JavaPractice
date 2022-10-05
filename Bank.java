class Account {
    //Access modifiers
    String branch;
    public String name;
    protected String email;
    private String password; //accessed by getter n setters
    public String getPassword(){
        setPassword("abcdefgh");
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
}

public class Bank {
    public static void main(String args[]){
        Account a1 = new Account();
        a1.name = "My Account";
        a1.branch = "Noida";
        a1.email = "myAccount@abc.com";
        //a1.setPassword("abcd");
            System.out.println("Branch: " + a1.branch + ", Email: " + a1.email + ", Account Name: " + a1.name + ", Password: " +a1.getPassword());

    }
}