import java.io.*;
import java.util.*:

public class IsPalindrome {

	public static void main(String args[]) {
		System.out.println(">>> Check if the word is a Palindrome : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter a string : ");
			String str = br.readLine();
			boolean ispalindrome = checkPalindrome(str);
			if(ispalindrome == true)
				System.out.println("Palindrome");
			else
				System.out.println("Not a Palindrome");
		} catch(Exception e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
	}

	public static boolean checkPalindrome(String str) {
		int n = str.length();
		for(int i=0; i<(n/2); i++) {
			if(str.charAt(i) != str.charAt((n-1)-i))
				return false;
		}
		return true;
	}

}