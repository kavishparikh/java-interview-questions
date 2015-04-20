import java.io.*;
import java.util.*;

public class Threads {
 
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
        Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");
        System.out.println("Starting Runnable threads");
        t1.start
        t1.join(2000); //Start second thread only after waiting for 2 seconds or when first thread is dead.
        t2.start();
        System.out.println("Runnable Threads has been started");
        Thread t3 = new MyThread("t3");
        Thread t4 = new MyThread("t4");
        System.out.println("Starting MyThreads");
        t3.start();
        t4.start();
        System.out.println("MyThreads has been started");
        long end = System.currentTimeMillis();
        System.out.println("main thread execution time : "+(end - start));
         
    }
}


//NOTE : Implementing Runnable is preferred because java supports implementing multiple interfaces. 
//If you extend Thread class, you can’t extend any other classes.


class HeavyWorkRunnable implements Runnable {
 
    @Override
    public void run() {
        System.out.println("Doing heavy processing - START "+Thread.currentThread().getName());
        try {
            //When the thread is sleeping it does not lose any monitors or locks acquired.
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doing heavy processing - END "+Thread.currentThread().getName());
    }
 
    private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
 
}


class MyThread extends Thread {
 
    public MyThread(String name) {
        super(name);
    }
 
    @Override
    public void run() {
        System.out.println("MyThread - START "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread - END "+Thread.currentThread().getName());
    }
 
    private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
     
}

 
