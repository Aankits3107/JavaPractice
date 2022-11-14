//Annonymous class - an inner class without a name.
//                   only a single object is created from one annonymous class
//                   the object have "extra" or "changes"
//                   no need to create a seprate innerclass, when we only need it once.
//Advantage - Helps us to avoid untidy code with a seprate class name
//            Usefull in actionlistners.
//Syntax is similar to a constructor, except that there is also a class defination within a block of code.

package Annonymous;

public class AnnonymousInnerClass {
    public static void main(String[] args) {
        //normal approch
        Greeting greeting1 = new Greeting();
        greeting1.Welcome();

        //annonymous approch
        Greeting greeting2 = new Greeting() { //chnage the constructor with a defination inside
            @Override
            public void Welcome() {
                System.out.println("Yoo Bro");
            }
        };
        greeting2.Welcome();

        MyFrame myFrame = new MyFrame();
    }
}
