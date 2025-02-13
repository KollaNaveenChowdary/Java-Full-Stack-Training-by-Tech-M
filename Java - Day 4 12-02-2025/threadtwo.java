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

        // Execute run() directly (runs in main thread)
        t2.run();

        // Start two separate threads for ThreadTwo
        ThreadTwo tTwo = new ThreadTwo();
        Thread threadTwo1 = new Thread(tTwo);
        Thread threadTwo2 = new Thread(tTwo);

        threadTwo1.start(); // Thread 5
        threadTwo2.start(); // Thread 6

        // Execute run() method once in the main thread
        tTwo.run();

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

// New ThreadTwo class
class ThreadTwo implements Runnable {
    public void run() {
        System.out.println("From ThreadTwo!");
        System.out.println("From ThreadTwo!");
        System.out.println(10 / 0); // This will cause an exception
    }
}

