import java.io.*;
import java.util.*;

public class AddTwoBitStrings {

	static String str1 = "1100110";
	static String str2 = "11";

	public static String addTwoStrings(String first, String second) {
		// the first part makes the 2 bit strings of equal length
		int str1len = first.length();
		int str2len = second.length();
		if(str1len < str2len) {
			for(int i=0; i<str2len - str1len; i++)
				first = '0' + first;
		} else {
			for(int i=0; i<str1len - str2len; i++)
				second = '0' + second;
		}
		
		/// does the bit addition operation
		String result = "";
		int carry = 0;

		int length = (str1len>str2len)?str1len:str2len;

		for(int i=length-1; i>=0; i--) {
			int firstBit = first.charAt(i);
			int secondBit = second.charAt(i);
			int sum = (firstBit ^ secondBit ^ carry) + '0';
			result = (char)sum + result;
			carry = (firstBit & secondBit) | (secondBit & carry) | (firstBit & carry);
		}
		if(carry == 1)
			result = '1'+result;
		return result;
	}

	public static void main(String args[]) {
		String output = addTwoStrings(str1, str2);
		System.out.println(output);
	}
}