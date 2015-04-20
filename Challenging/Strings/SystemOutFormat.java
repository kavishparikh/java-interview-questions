import java.io.*;
import java.util.*;
import java.lang.*;

public class SystemOutFormat {

	public static void main(String args[]) {

		System.out.println(">>> Understanding System.out.format(); ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			System.out.println("Please enter a number :");
			int number = Integer.parseInt(br.readLine());

			System.out.println("The Number in println : " + number); 

			// The %n move to the cursor to newline after executing statement
			System.out.format("The number in format : %d%n", number);

			System.out.format("The number in format : %8d%n", number);
			System.out.format("The number in format : %10d%n", number);

			// adds + to the number but keeps the number of decimal to 8
			System.out.format("The number in format : %+8d%n", number);

			// adds , every 3 places within number
			System.out.format("The number in format : %,8d%n", number);

			System.out.format("The value of Pi is approx. : %.4f%n", Math.PI);

			System.out.format("The number in hex format : %h%n", number);

			System.out.format("Enter a string : ");
			String s= br.readLine();
			System.out.format("The entered string : " + s);
			
		} catch(Exception e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}

	}

}