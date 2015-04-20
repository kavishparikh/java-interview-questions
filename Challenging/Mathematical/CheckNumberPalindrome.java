import java.io.*;
import java.util.*;

public class CheckNumberPalindrome {

	public static boolean isPalindrome(int number) {
		if(number == reverse(number))
			return true;
		return false;
	}

	
	// This method reverses the number - GOOD
	public static int reverse(int number) {
		int reverseNum = 0;
		while(number != 0) {
			reverseNum = reverseNum*10 + number%10;
			number = number/10;
		}
		return reverseNum;
	}

	public static void main(String[] args) {
		
	}

}