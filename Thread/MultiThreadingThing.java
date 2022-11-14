package Thread;

// //one way to create multi thread is by extend thread class
// public class MultiThreadingThing extends Thread {
    
//     private int threadNumber;

//     public MultiThreadingThing(int threadNumber) {
//         this.threadNumber = threadNumber;
//     }
//     @Override
//     public void run() {
//         for(int i = 1; i <= 5; i++) {
//                 System.out.println(i + " from thread " + threadNumber);
//             if (threadNumber == 3) {
//                 throw new RuntimeException();
//             }
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

//Other way to create multi thread is by implement Runnable interface
public class MultiThreadingThing implements Runnable {
    
    private int threadNumber;

    public MultiThreadingThing(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
                System.out.println(i + " from thread " + threadNumber);
            // if (threadNumber == 3) {
            //     throw new RuntimeException();
            // }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
