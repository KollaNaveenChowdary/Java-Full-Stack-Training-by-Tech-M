class Thread1 extends Thread {
    public void run() {
        System.out.println("From Thread1! " + this.getName());
        // Uncommenting the following line will cause an exception
        // System.out.println(10/0);
    }
}

class Thread2 implements Runnable {
    public void run() {
        try {
            System.out.println(10 / 0); // This will cause an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in Thread2: " + e.getMessage());
        }
    }
}

public class MultiThreadingExample {
    public static void main(String[] args) { // Thread 1
        System.out.println("From Main thread!");
        System.out.println("From Main thread!");
        System.out.println("From Main thread!");

        Thread1 t1 = new Thread1();
        t1.start(); // Calls run method - Thread 2

        Thread2 t2 = new Thread2();
        Thread tt2 = new Thread(t2);

        new Thread(t2).start(); // Thread 3
        tt2.start(); // Thread 4
        
        // This directly calls the run() method in the main thread
        t2.run();

        // Handle exception in the main thread
        try {
            System.out.println(10 / 0); // This will cause an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}