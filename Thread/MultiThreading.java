//Multithreading - is the ability to execute multiple different paths of code at the same time.
//Benifit of multi thread - if on ethread got execption it dosen't affect the other thread performance.
//If you extend thread you can't extend another class.
//If you implement runnable you can extend any other class, and implemnt another interfaces too.

package Thread;

public class MultiThreading {
    public static void main(String[] args) {
        // MultiThreadThing myThing1 = new MultiThreadThing();
        // myThing1.start(); //to start multi concurrent thread. use start method.
        // // myThing1.run(); //this will run one time and then after completing first time, them go second time.
        // MultiThreadThing myThing2 = new MultiThreadThing();
        // myThing2.start();

        for(int i = 0; i <=5; i++) { //to check which thread is printhing which number.
            MultiThreadingThing myThing = new MultiThreadingThing(i);
            // myThing.start(); 
            // to call be runnable interface do this:
            Thread myThread = new Thread(myThing);
            myThread.start();
            // try {
            //     myThread.join();  //Needs try catch block. It waits for this thread to die. Stop the thread, until the program executes - wait till first one complete.
            // } catch (InterruptedException e) {
            //     // TODO Auto-generated catch block
            //     e.printStackTrace();
            // }
            myThread.isAlive(); //retrun boolean if thread is alive or not.
        }
        throw new RuntimeException(); //just for fun
    }
}
