//Multithreading - Process of executing multiple threads simultaniously
//helps maximize the CPU utilization
//Threads are independent, they don't affect the execution of other threads.
//              exception in one thread not affect anothers working.
//Use in multiplayer gaming, serving multi client
//2 ways to create Thread - 1. Subclass extending the thread class , override run method.
//                          2. We can create a instance of a class which is impelementing the interface of Runnable interface, and we pass this instance within a constructor of the thread object.
//
//

package Thread;

public class Multi_Thread {
    public static void main(String[] args) throws InterruptedException {
        //1.
        MyThread thread1 = new MyThread();
        // thread1.setDaemon(true); //is abackgrounf thread - a non user thread. JVM not wait to exit for demaion threads, But if one user thread remain JVM will wait (not exit).
        thread1.start();
        thread1.join(3000); //calling thread (ex.main) waits until the specified thread dies or for x milliseconds
        //2.
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);
        // thread2.setDaemon(true);
        thread2.start();
            // System.out.println(1/0); // execption
     }
}
