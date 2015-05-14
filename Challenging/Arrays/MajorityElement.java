import java.io.*;
import java.util.*;

// A majority element in an array A[] of size n is an element that appears more than n/2 
// times (and hence there is at most one such element)

// Approach 1 : Since the majority always take more than a half space, the middle element 
//			  	is guaranteed to be the majority. Sorting array takes nlog(n). So the time 
//			  	complexity of this solution is nlog(n) - But this approach assumes that there
//				will always be a majority middle element

// Approach 2 : We can sort the array first, which takes time of nlog(n). Then scan once to 
//				find the longest consecutive substrings.

public class MajorityElement {

	public static java.lang.Integer majorityElement(int[] arr) {
		if (arr == null)
			return null;
		if (arr.length == 1)
			return arr[0];
		
		Arrays.sort(arr);
		int count = 1;
		int previous = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i] == previous) {
				count++;
				if (count > arr.length/2)
					return arr[i];
			} else {
				count = 1;
				previous = arr[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] arr = {
			1, 2, -3, 4, -3, -3, -3, 4, -3
		};
		Integer majorElement = majorityElement(arr);
		// need to use -ea to enable assertion option in JVM
		assert (majorElement > 0) : "element less than 0"; 
		if (majorElement != null)
			System.out.println("The majority element is : " + majorElement);
		else
			System.out.println("There is no major element");
	}
}