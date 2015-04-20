import java.io.*;
import java.util.*;

public class NewtonsSquareRoot {

	public static void main(String args[]) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Enter to number to calculate a Square Root for : ");
			double number = Double.parseDouble(br.readLine());

			double squareroot = calculateSquareRoot(number);

			System.out.println("The Square root of number " + number + " is : " + squareroot);

		} catch(Exception e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}

	}


	// Calculating square root using Newtons Method
	public static double calculateSquareRoot(double number) {
		if(number < 0) return Double.NaN;
		double err = 1e-15;
		double t=number;
		while(Math.abs(t - number/t) > err*t)
			t = (number/t + t)/2.0;
		return t;  
	}


}	