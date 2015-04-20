import java.io.*;
import java.util.*;

public class AssertionExample {
	public static void main(String args[]) {
		System.out.println(">>> Assertions Example : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter your age : ");
			int age = Integer.parseInt(br.readLine());
			
			// Assertions are used to test assumptions about the program, if it fails, The JVM throws error.
			assert age>=18 : "Invalid";
			System.out.println("Age is " + age);

			// Small practise for foreach statement
			int[] arr = {1, 2, 3, 4, 5, 6 };
			for(int i : arr) {
				System.out.println(i);
			}
		} catch(Exception e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
	}
}