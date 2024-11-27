// Step 1: Create a class that implements Runnable
class MyRunnable implements Runnable {
    // Step 2: Override the run method
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(1000); // Pause for a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Interface part is taken care of by implementing Runnable

public class Multithread {
    public static void main(String[] args) {
        // Step 3: Create instances of MyRunnable
        MyRunnable runnable1 = new MyRunnable();
        // MyRunnable runnable2 = new MyRunnable();

        // Create threads
        Thread thread1 = new Thread(runnable1);
        // Thread thread2 = new Thread(runnable2);

        // Step 4: Start the threads
        thread1.start();
        // thread2.start();
    }
}
// import java.io.*;
// import java.util.*;

// class Demo1 extends Thread {
//     public void run() {
//         for (int i = 0; i < 4; i++) {
//             System.out.println("Class 1 is running pretty well.");
//             try {
//                 Thread.sleep(1000);
//             } catch (Exception e) {
//             }

//         }
//     }
// }

// class Demo2 extends Thread {
//     public void run() {
//         for (int i = 0; i < 4; i++) {
//             System.out.println("Class 2 is running pretty well.");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//             }

//         }
//     }
// }

// public class Multithread {
//     public static void main(String[] args) {
//         int n = 4;
//         Demo1 obj = new Demo1();
//         Demo2 obj2 = new Demo2();
//         obj.start();
//         obj2.start();
//     }
// }