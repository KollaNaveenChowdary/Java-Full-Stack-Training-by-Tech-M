import java.util.*;
import java.io.*;
import java.lang.*;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) {//Thread 1
        System.out.println("From Main thread!");
        System.out.println("From Main thread!");
        System.out.println("From Main thread!");
        NTask1 t1 = new NTask1();
        t1.start();//calls run method-Thread 2
        //t1.run();
        NTask2 t2 = new NTask2();
        Thread tt2 = new Thread(t2);
        new Thread(t2).start();//Thread 3
        tt2.start();//Thread 4
        t2.run();

        System.out.println(10 / 0);
    }
}

class NTask1 extends Thread {
    public void run() {
        System.out.println("From NTask1!" + this.getName());
        // System.out.println(10/0);
    }
}

class NTask2 implements Runnable {
    public void run() {
        //System.out.println("From NTask2!");
        System.out.println(10 / 0);
    }
}