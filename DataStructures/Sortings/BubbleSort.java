//package Sorting;

import java.util.*;

public class BubbleSort {
	public static void main(String args[]){
		
		int[] a = {4, 8, 10, 6, 3};
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j< (a.length -1); j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.println("Partial Sorted Array : ");
			for(int x :a)
				System.out.print(x+" ");
			System.out.println();
		}
		
		System.out.println("Sorted Array : ");
		for(int x :a)
			System.out.print(x+" "); 
		
	}
}
