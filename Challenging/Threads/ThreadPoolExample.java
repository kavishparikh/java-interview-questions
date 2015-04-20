import java.io.*;
import java.util.*;

public class ThreadPoolExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i=0; i<100; i++) {
			service.submit(new Tasks(i));
		}
	}

}


final class Tasks implements Runnable {
	private int taskId;

	public Tasks(int id) {
		this.taskId = id;
	}

	public void run() {
		System.out.println("Task ID : " + this.taskId + " performed by : " + Thread.currentThread().getName());
	}
}