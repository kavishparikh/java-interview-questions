import java.io.*;
import java.util.*;

// Bucket sort (bin sort) is a stable sorting algorithm based on partitioning the input 
//array in several parts, called buckets and using some other algorithm for sorting these sub problems

// 1. Bucket sort can be used for distributed sorting – each bucket can be ordered by a different 
// thread or even by a different computer. 
// 2. Another use case is a sorting of huge input data, which cannot be loaded into the main memory 
// by an ordinary O(n.log(n)) algorithm. This problem can be solved by dividing the data into 
// sufficiently small buckets, sorting them one by one by appropriate algorithm, while storing rest 
// of the data in the external memory (e.g. hard drive).

// Asymptotic complexity of bucket sort is O(n+k), where n is size of the input array, m is 
// the number of buckets and k is the complexity of the inner sorting algorithm.

public class BucketSort {

	public static int[] bucketSort(int[] array, int bucketCount) {
		if (bucketCount <= 0) 
			throw new IllegalArgumentException("Invalid Bucket Count");
		if (array.length <= 1)
			return array;

		int high = array[0];
		int low = array[0];
		
		// Gets the range of input element
		for (int i=1; i<array.length; i++) {
			if (array[i] > high)
				high = array[i];
			if (array[i] < low)
				low = array[i];
		}
		// Range of one bucket
		double interval = ((double)(high - low + 1)) / bucketCount;
		System.out.println("Interval : " + interval);

		ArrayList<Integer>[] buckets = new ArrayList[bucketCount];
		// Intializing the ArrayList for buckets
		for (int i=0; i<bucketCount; i++) {
			buckets[i] = new ArrayList();
		}

		for (int i=0; i<array.length; i++) {
			System.out.println("Splitting in bucket number " + (int)((array[i] - low) / interval) + " : " + array[i]);
			buckets[(int)((array[i] - low) / interval)].add(array[i]);
		}

		int pointer = 0;
		for (int i=0; i<buckets.length; i++) {
			// NOTE: collcetions.sort() uses Merge sort unlike Arrays.sort() which uses Quick sort
			Collections.sort(buckets[i]);
			for (int j=0; j<buckets[i].size(); j++) {
				array[pointer] = buckets[i].get(j);
				pointer++;
			}
		}
		return array;
	}

	
	public static void printArray(int[] array) {
		for (int i: array)
			System.out.print(i + " ");
		System.out.println();
	}


	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] array = {
			// 5, 3, 0, 2, 4, 1, 0, 5, 2, 3, 1, 4
			9, 2, 4, 7, 3, 7, 0
		};

		System.out.println("Enter a bucket count : ");
		int bucketCount = Integer.parseInt(br.readLine());

		printArray(array);
		array = bucketSort(array, bucketCount);
		printArray(array);
	}

}