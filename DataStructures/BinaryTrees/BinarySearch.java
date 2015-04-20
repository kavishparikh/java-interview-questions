import java.io.*;
import java.util.*;

public class BinarySearch{

	public static void main(String args[]){

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			int nElems = arr.length;
			System.out.println("Content of Array : ");
			for(int x : arr)
				System.out.print(x+"\t");

			System.out.print("Enter the number to be searched?");
			int n = Integer.parseInt(br.readLine());

			int num = binarySearchNumber(n, arr);

			System.out.println("The number you are searching is at index :"+num);
		} catch(Exception e) {
			System.out.println("Exception caught");
			e.printStackTrace();
		}
	}


	// This method adds new elements into the array in ordered sequence
	public void insert(int value) {
		for(int j=0; j<nElems; j++)
			if(arr[j] > value) break;
		for(int k=nElems; k>0; k--)
			a[k] = a[k-1];
		a[j] = value;
		nElems++;
	}


	// public static int recursiveBinarySearch(int key, int[] arr, int lowerBound, int upperBound) {
	// 	int curIn;
	// 	curIn = (lowerBound + upperBound)/2;
	// 	if(arr[curIn] == key)
	// 		return curIn;
	// 	else if(lowerBound > upperBound)
	// 		return nElems;
	// 	else {
	// 		if(arr[curIn] < key)
	// 			recursiveBinarySearch(key, arr, curIn+1, upperBound);
	// 		else
	// 			recursiveBinarySearch(key, arr, lowerBound, curIn-1);
	// 	}
	// }


	public static int binarySearchNumber(int n, int[] arr){
		int lowerBound = 0;
		int upperBound = arr.length -1;
		int curIn;
		while(true){
			curIn = (lowerBound+upperBound)/2;
			if(arr[curIn] == n)
				return curIn;
			else if(lowerBound > upperBound)
				return (arr.length);
			else if(arr[curIn] < n)
				lowerBound = curIn + 1;
			else
				upperBound = curIn - 1;
		}
	} 
}
