import java.io.*;
import java.util.*;

/****
Given an Array[] and an element X, find a pair in array who's sum totals to X
1. Sort the array in ascending order
2. Intitialize the left to 0 and right to array.length -1
3. if(arr[l] + arr[r] == element) return 1;
	else if(arr[l] + arr[r] < element) l++
	else r--
4. No pair in array - return 0
****/

public class CheckPairInArrayForSum {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int[] arr = {1, 4, 45, 6, 10, -8};
		System.out.println("Enter the element for which to find a pair ?");
		int element = in.nextInt();

		boolean found = findPair(element, arr);
		if(found == true)
			System.out.println("Pair is present");
		else
			System.out.println("Pair not present");
	}

	public static boolean findPair(int element, int[] arr) {

		Arrays.sort(arr);
		int left = 0;
		int right = arr.length-1;
		while(left < right) {
			if(arr[left] + arr[right] == element)
				return true;
			else if(arr[left] + arr[right] < element)
				left++;
			else
				right--;
		}
		return false;
	}
}