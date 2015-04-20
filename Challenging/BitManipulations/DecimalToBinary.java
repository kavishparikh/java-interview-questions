import java.io.*;
import java.util.*;

public class DecimalToBinary {
	public static void main(String args[]) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a positive number");
			int number = Integer.parseInt(br.readLine());

			if(number < 0)
				System.out.println("The number is not positive");
			else 
				printBinary(number);

			// Easier way to do it, using the following method
			System.out.println("\nUsing java function : " + Integer.toBinaryString(number));
		} catch(IOException e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
		
	}

	public static void printBinary(int number) {
		int remainder;
		if(number <= 1) {
			System.out.print(number);
			return;
		} else {
			remainder = number%2;
			printBinary(number >> 1);
			System.out.print(remainder);
		}
	}
}