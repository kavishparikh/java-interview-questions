import java.io.*;
import java.util.*;

public class PrimeNumer {

	public static void main(String args[]) {

		System.out.println(">>> Identify the Prime Number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			System.out.println("Please enter a number :");
			int number = Integer.parseInt(br.readLine());

			boolean isPrimeNumber = isPrime(number);

			if(isPrimeNumber == true)
				System.out.println("The Number is a Prime Number");
			else
				System.out.println("The Number is not a Prime Number");

		} catch(Exception e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}

	}

	public static boolean isPrime(int number) {

		if(number<2) 
			return false;
		for(int i=2; i*i<=number; i++) {
			if(number%i == 0) 
				return false;
		}
		return true;

	}


}