import java.io.*;
import java.util.*;

// Calculate cube root of a number, the eay way is to use Math.cbrt() for cube root and sqrt() fro square root

public class CubeRoot {
	
	public static void main(String[] args) throws Exception {
		int[] abc = new int[10];
		Arrays.fill(abc, -1);
		for (int x : abc) {
			System.out.print(x + " ");	
		}
		System.out.println();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double num = 2345;
		System.out.println("Enter the value for n'th root of a number :");
		double nth = Integer.parseInt(br.readLine());
		double nthroot = Math.pow(num, 1/nth);
		// Please note how to round the values
		System.out.println("Nth root of number " + num + " is " + (double)Math.round(nthroot * 100)/100);
	}
}
