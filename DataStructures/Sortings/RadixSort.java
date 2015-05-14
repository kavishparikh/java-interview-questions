import java.io.*;
import java.util.*;

// Radix sorts time complexity O(nk) time, which is almost linear time

// 	Statement:
//     Given a disordered list of integers, rearrange them in natural order.
//  
//   Sample Input: {18,5,100,3,1,19,6,0,7,4,2}
//  
//   Sample Output: {0,1,2,3,4,5,6,7,18,19,100}
//  
//   Time Complexity of Solution:
//     Best Case O(k*n); Average Case O(k*n); Worst Case O(k*n),
//     where k is the length of the longest number and n is the
//     size of the input array.
//  
//     Note: if k is greater than log(n) then an n*log(n) algorithm would be a
//           better fit. In reality we can always change the radix to make k
//           less than log(n).
//  
//   Approach:
//     radix sort, like counting sort and bucket sort, is an integer based
//     algorithm (i.e. the values of the input array are assumed to be
//     integers). Hence radix sort is among the fastest sorting algorithms
//     around, in theory. The particular distinction for radix sort is that it
//     creates a bucket for each cipher (i.e. digit); as such, similar to
//     bucket sort, each bucket in radix sort must be a growable list that may
//     admit different keys.
//  
//     For decimal values, the number of buckets is 10, as the decimal system
//     has 10 numerals/cyphers (i.e. 0,1,2,3,4,5,6,7,8,9). Then the keys are
//     continuously sorted by significant digits.

public class RadixSort {

	public static int[] radixSort(int[] array) {
		final int RADIX = 10;
  		
  		// declare and initialize bucket[]
	 	List<Integer>[] bucket = new ArrayList[RADIX];
	  	for (int i = 0; i < bucket.length; i++) {
	    	bucket[i] = new ArrayList<Integer>();
	  	}
 
	  	// sort
	  	boolean maxLength = false;
	  	int temp = -1;
	  	int placement = 1;
	  	
	  	while (!maxLength) {
	    	maxLength = true;
	    	// split array between lists
	    	for (Integer i : array) {
		      	temp = i / placement;
		      	System.out.println("Splitting in bucket number " + (temp % RADIX) + " : " + i);
		      	bucket[temp % RADIX].add(i);
		      	if (maxLength && temp > 0) {
		        	maxLength = false;
		      	}
	    	}
	    
	    	// empty lists into array
		    int a = 0;
		    for (int b = 0; b < RADIX; b++) {
		      	for (Integer i : bucket[b]) {
		        	array[a++] = i;
		      	}
		      	bucket[b].clear();
		    }
		    System.out.print("Intermadiate Array : ");
		    for (int i: array)
				System.out.print(i + " ");
			System.out.println();
		    
		    // move to next digit
		    placement *= RADIX;
  		}
  		return array;
	}

	public static void printArray(int[] array) {
		for (int i: array)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = { 
			// 5, 3, 0, 2, 4, 1, 0, 5, 2, 3, 1, 4
			// 9, 2, 4, 7, 3, 7, 10
			234, 524, 1234, 643, 74, 56, 34, 85, 4, 978, 4546, 635, 235, 77, 7635, 123, 8765, 12345, 7474 
		};
		printArray(array);
		array = radixSort(array);
		printArray(array);
	}

}