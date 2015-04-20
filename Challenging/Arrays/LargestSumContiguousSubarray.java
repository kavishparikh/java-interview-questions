import java.io.*;
import java.util.*;

// Kadane's Algorithm - Very Important

public class LargestSumContiguousSubarray {

	public static void main(String args[]) {
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		int arrLength = arr.length;
		int maxSum = maxSubArraySum(arr, arrLength);
		System.out.println("Maximum sum : " + maxSum);
	}

	public static int maxSubArraySum(int[] arr, int arrLength) {
		int max_so_far = arr[0];
		int current_max = arr[0];
		
		for(int i=1; i<arrLength; i++) {
			current_max = max(arr[i], current_max + arr[i]);
			max_so_far = max(max_so_far, current_max);
		}
		
		return max_so_far;
	}

	public static int max(int x, int y) {
		return (x>y)?x:y;
	}

}