import java.io.*;
import java.util.*;

public class CheckPalindrome{

	public static void main(String args[]){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a word of your choice :");
			String str = br.readLine();
			System.out.println("The string entered is "+str);
			System.out.println("Checking if the word is palindrome or not");
			boolean bool = checkWord(str);
			if(bool == true)
				System.out.println("String is a Palindrome");
			else
				System.out.println("String is a not Palindrome");
		}catch(Exception e){
			System.out.println("Exception caught");
			e.printStackTrace();
		}
	}

	// Check IsPalindrome.java in Challenging section, better and compact
	public static boolean checkWord(String str){
		int slength = str.length() - 1;
		boolean isPalindrome = true;
		char[] strArr = str.toCharArray();
		for(int i=0; i<(slength/2); i++){
			if(strArr[i] != strArr[slength]){
				isPalindrome = false;
				return isPalindrome;
			}
			slength--;	
		}
		return isPalindrome;
	}
}