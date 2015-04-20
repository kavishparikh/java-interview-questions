import java.io.*;
import java.util.*;

public class EuclidsGCDAlgorithm{
	public static void main(String args[]){
		System.out.println(">>> Euclids Graetest Common Divisor Algorithm");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.println("Enter 2 number of your choice :");
			int first = Integer.parseInt(br.readLine());
			int second = Integer.parseInt(br.readLine());

			int gcd = calculateGCD(first, second);
			System.out.println("The GCD is : "+gcd);	
		}catch(Exception e){
			System.out.println("Exception caught");
			e.printStackTrace();
		}

	}

	public static int calculateGCD(int p, int q){
		if(q == 0) return p;
		int r = p % q;
		return calculateGCD(q, r);
	}
}