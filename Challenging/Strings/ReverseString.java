import java.io.*;
import java.util.*;

public class ReverseString {

	// Iterative method
	public static String reverse(String reverseThis) {
		StringBuilder sb = new StringBuilder();
		char[] strChars = reverseThis.toCharArray();
		for(int i=reverseThis.length-1; i<= 0; i--)
			sb.append(strChars[i]);
		return sb.toString();
	}

	// Recursive Method
	public static String reverseRecursively(String reverseThis) {
		if(reverseThis.length() < 2)
			return reverseThis;
		return reverseRecursively(reverseThis.substring(1)) + reverseThis.charAt(0);
	}


	public static void reverseString(String reverseThis) {
		
		// Using StringBuffer
		String reversedString = new StringBuffer(reverseThis).reverse().toString();
		System.out.println("Reversed String using String buffer : " + reversedString);

		// Iterative method to reverse string
		reversedString = reverse(reverseThis);
		System.out.println("Reversed using iterative method :" + reversedString);

		// Recursive method to reverse string
		reversedString = reverseRecursively(reverseThis);
		System.out.println("Reversed using recursive method :" + reversedString);
	}

	public static void main(String[] args) {
		String reverseThis = "Hello people, hoq are you?";
		reversedString(reverseThis);
 		
	}

}