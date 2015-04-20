import java.io.*;
import java.util.*;

class Addition extends Thread {
	int value;
	public void run() {
		System.out.println("Inside thread t1");
		value = 1+2;
	}
}

class Multiplication extends Thread {
	int value;
	public void run() {
		System.out.println("Inside thread t2");
		value = 1*2;
	}
}

public class ThreadsWithJoins {
	public static void main(String args[]) {
		Addition t1 = new Addition();
		Multiplication t2 = new Multiplication();

		t1.start();
		t2.start();

		try {
			// join() stops the parent thread from executing untill the callee method completes with its execution
			t1.join();
			t2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}

		double n = ((double)t2.value/t1.value);

		System.out.println("The final value : " + n);
	}
}