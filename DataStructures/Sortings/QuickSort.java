import java.io.*;
import java.util.*;

public class QuickSort {

	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
		if (low >= high)
			return;

		// Finding the pivot
		int middle = low + (high - low) / 2;
		int pivot =  arr[middle];

		int i = low;
		int j = high;

		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if (low < j)
			quickSort(arr, low, j);
		if (high > i)
			quickSort(arr, i, high);
	}

	public static void printArray(int[] arr) {
		for (int i: arr) 
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = {
					9, 2, 4, 7, 3, 7, 10
				};
		printArray(arr);

		int arrLength = arr.length - 1;
		quickSort(arr, 0, arrLength);
		printArray(arr);
	}

}