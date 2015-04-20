import java.io.*;
import java.util.*;

public class IntegersAsStrings {

	// This method will habdle all cases, such as very very long number strings
	public static String addStrings(String one, String two) {
		String addition = "";
 
		int carry = 0;
		int lengthOne = one.length();
		int lengthTwo = two.length();
 
		int limit = 0;
		if(lengthOne == lengthTwo || lengthOne > lengthTwo) 
			limit = lengthOne;
		else if(lengthOne < lengthTwo) 
			limit = lengthTwo;
 
		for(int i=0; i<limit; i++) {
			int firstInt = 0;
			int secondInt = 0;
 
			if(i<lengthOne) 
				firstInt = (int) one.charAt(lengthOne-1-i) - '0';
			if(i<lengthTwo) 
				secondInt = (int) two.charAt(lengthTwo-1-i) - '0';
 
			int sum = firstInt + secondInt + carry;
			carry = sum/10;
			int value = sum%10;
 
			addition += ""+value;
		}
 
		StringBuffer sb = new StringBuffer(addition.length());
 
		for(int i=addition.length()-1; i>=0; i--) 
			sb.append(addition.charAt(i));
 
		return sb.toString();
	}


	public static void main(String[] args) {
		String numOne = "123";
		String numTwo = "456";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int one = Integer.parseInt(numOne);
		int two = Integer.parseInt(numTwo);
		int add = one+two;
		String sum = ""+add;
		// String sum = Integer.toString(add); <- This method will also word
		System.out.println(sum);
	}

}