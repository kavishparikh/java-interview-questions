import java.io.*;
import java.util.*;

public class LongestConsecutiveSequence {

	public static int longestConsecutiveSequence(int[] arr) {
		if(arr.length == 0)
			return 0;
		
		Set<Integer> numSet = new HashSet<Integer>();
		int max = 1;

		for(int n : arr)
			numSet.add(n);
		for(int n : arr) {
			int left = n - 1;
			int right = n + 1;
			int count = 1;
			while(numSet.contains(left)) {
				count++;
				numSet.remove(left);
				left--;
			}
			while(numSet.contains(right)) {
				count++;
				numSet.remove(right);
				right++;
			}
			max = Math.max(count, max);
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {3, 6, 34, 76, 45, 2, 1, 7, 4, 9, 5, 100, 345};
		int result = longestConsecutiveSequence(arr);
		System.out.println("The longest Consecutive Sequence is : " + result); 
	}

}