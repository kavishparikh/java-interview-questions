import java.io.*;
import java.util.*;

public class PermutationsOfString {

	public static Set<String> permutationFinder(String str) {
		Set<String> perm = new HashSet<String>();

		// Handling error scenarios
		if(str == null) {
			return  null;
		} else if(str.length() == 0) {
			perm.add("");
			return perm;
		}
		// Saving first character
		char initial = str.charAt(0);
		// Full string without first character
		String rem = str.substring(1);

		Set<String> words = permutationFinder(rem);

		for(String strNew : words) {
			for (int i=0; i<=strNew.length(); i++) {
				perm.add(charInsert(strNew, initial, i));
			}
		}
		return perm;
	}

	public static String charInsert(String str, char c, int j) {
		String begin = str.substring(0, j);
		String end = str.substring(j);
		return begin + c + end;	
	}

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "ABCD";
		//String s3 = "MANISHA";
		System.out.println("The permutation for String " + s1 + " is : " + permutationFinder(s1));
		System.out.println("The permutation for String " + s2 + " is : " + permutationFinder(s2));
		//System.out.println("The permutation for String " + s3 + " is : " + permutationFinder(s3));
	}

}