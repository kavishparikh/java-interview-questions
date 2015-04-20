import java.io.*;
import java.util.*;

/****
Given an array where every element appears twice except one element.
To find that element we need to do bitwise XOR operation for all elements
NOTE : this method works because XOR of two elements will result in 0, hence even occurrences will be neutralized
and provide only the odd occurrences
****/

public class OddOccuringNumber {

	public static void main(String args[]) {
		int arr[] = {1, 2, 3, 2, 3, 1, 3};
		int oddNumber = getOddOccurance(arr);
		System.out.println("Odd occuring number : " + oddNumber);
	}

	public static int getOddOccurance(int[] arr) {
		int res = 0;
		for(int i=0; i<arr.length; i++) 
			res = res ^ arr[i];
		return res;
	}
}