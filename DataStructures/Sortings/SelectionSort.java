package Sorting;

import java.util.*;

public class SelectionSort {
	
	public static void main(String args[]){
		
		int[] a = {4, 8, 10, 6, 3};
		
		//NOTE : The selection sort minimizes the number of swaps, but the number of comparisons is
		//	still high. This sort might be useful when the amount of data is small and swapping
		//	data items is very time-consuming compared with comparing them.

		//Selection sort logic
		int out, in, min;
		for(out=0; out<(a.length-1); out++){
			min = out;
			for(in = out+1; in<a.length; in++){
				if(a[in] < a[min]){
					min = in;
					int temp = a[min];
					a[min] = a[out];
					a[out] = temp;
				}
				System.out.println("Partial sorted Array : ");
				for(int x : a)
					System.out.print(x+" ");
				System.out.println();
			}
		}
		System.out.println("Sorted array : ");
		for(int x :a)
			System.out.print(x+" ");
	}
	
}
