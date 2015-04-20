import java.io.*;
import java.util.*;

public class RecursiveFibonacci {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numbr for which you nede to find the fibonacci number ?");
		int num = in.nextInt();
		int result = fibonacciRecursive(num);
		System.out.println("The fibonacci number : " + result);
		result = fibonacciIterative(num);
		System.out.println("The fibonacci number : " + result);
	}

	public static int fibonacciRecursive(int num) {
		if(num == 0)
			return 0;
		else if(num == 1)
			return 1;
		else
			return fibonacciRecursive(num-1) + fibonacciRecursive(num-2);
	}

	public static int fibonacciIterative(int num) {
		int first = 0;
		int second = 1;
		for(int i=0; i<num; i++) {
			System.out.println(first);
			// first = first + second;
			// second = first - second;
			int temp = first;
			first = second;
			second = temp + second; 
		}
		return first;		
	}
}