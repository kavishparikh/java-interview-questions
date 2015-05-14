import java.io.*;
import java.util.*;

public class BiggestElementInArray {

	// public static java.lang.Integer majorityElement(int[] arr) {}

	public static void main(String[] args) {
		int[] arr = {
			45, 43, 634, 124, 764, 235, 7463, 124, 235
		};
		Arrays.sort(arr);
		for (int x : arr) {
			System.out.print(x + " ");	
		}

		// The Arrays.binarySearch(int[], key) returns the element location
		// If there are duplicate value, it returns the first instance
		int location = Arrays.binarySearch(arr, 7463);
		System.out.println("\nLocation returned : " + location);
		System.out.println("\nThe biggest element before 7463 is : " + arr[location-1]);
		// The while loop handles the duplicate elements and last element
		while (location != arr.length-1) {
			if (arr[location+1] != 7463) {
				System.out.println("\nThe biggest ele ment after 7463 is : " + arr[location+1]);
				break;
			} else 
				location++;	
		}
	}
}