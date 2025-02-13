import java.util.*;

public class Main {
    public static void main(String[] args) { // Main Thread (Thread 1)
        System.out.println("From Main thread!");
        System.out.println("From Main thread!");
        System.out.println("From Main thread!");

        // Start Thread 2 (NTask1)
        NTask1 t1 = new NTask1();
        t1.start();

        // Start Thread 3 & Thread 4 (NTask2)
        NTask2 t2 = new NTask2();
        Thread tt2 = new Thread(t2);
        new Thread(t2).start();
        tt2.start();

        // Run method directly (runs in main thread)
        t2.run();

        // Create and start three separate threads for ThreadThree
        ThreadThree threadThree1 = new ThreadThree();
        ThreadThree threadThree2 = new ThreadThree();
        ThreadThree threadThree3 = new ThreadThree();

        threadThree1.start(); // Thread 5
        threadThree2.start(); // Thread 6
        threadThree3.start(); // Thread 7

        // Create and start one separate thread for ThreadRunnableOne
        ThreadRunnableOne threadRunnableOne = new ThreadRunnableOne();
        Thread threadOne = new Thread(threadRunnableOne);
        threadOne.start(); // Thread 8

        // Create and start two separate threads for ThreadRunnableTwo
        ThreadRunnableTwo threadRunnableTwo = new ThreadRunnableTwo();
        Thread threadTwo1 = new Thread(threadRunnableTwo);
        Thread threadTwo2 = new Thread(threadRunnableTwo);

        threadTwo1.start(); // Thread 9
        threadTwo2.start(); // Thread 10

        // This will cause an exception
        System.out.println(10 / 0);
    }
}

// Thread extending Thread class
class NTask1 extends Thread {
    public void run() {
        System.out.println("From NTask1! " + this.getName());
    }
}

// Thread implementing Runnable
class NTask2 implements Runnable {
    public void run() {
        System.out.println(10 / 0); // This will cause an exception
    }
}

// New ThreadThree class
class ThreadThree extends Thread {
    public void run() {
        System.out.println("From ThreadThree!");
        System.out.println("From ThreadThree!");
        System.out.println("From ThreadThree!");
        System.out.println("From ThreadThree!");
        System.out.println("From ThreadThree!");
    }
}

// New ThreadRunnableOne class
class ThreadRunnableOne implements Runnable {
    public void run() {
        System.out.println("From ThreadRunnableOne!");
        System.out.println("From ThreadRunnableOne!");
    }
}

// New ThreadRunnableTwo class
class ThreadRunnableTwo implements Runnable {
    public void run() {
        System.out.println("From ThreadRunnableTwo!");
        System.out.println("From ThreadRunnableTwo!");
        System.out.println("From ThreadRunnableTwo!");
    }
}

