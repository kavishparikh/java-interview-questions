import java.io.*;
import java.util.*;

/****
Majority element in an array[] of size N is an element which appears more than N/2 time. 
(Thus there can only be one such number)

METHOD 1 :
Use 2 loops and keep track of the maximum count of for all different element

METHOD 2 :
Use BST, insert elements in BST one by one and if elements already present in tree, increment the count of the node.
class Tree {
	int element;
	inr count;
} BST

METHOD 3 :
Sort the array first, which takes O(nlog(n)) time, then scan once to find longest consecutive substrings

****/
// Solving by method 3

public class MajorityElement {

	public static void main(String args[]) {
		int array[] = {3, 3, 4, 2, 4, 4, 2, 3, 4};
		int majorityPresent = findMajorityElement(array);
		if(majorityPresent == 0)
			System.out.println("NONE");
		else
			System.out.println("Majority number is : "+majorityPresent);
	}

	public static int findMajorityElement(int[] array) {
		Arrays.sort(array);
		if(array.length == 1)
			return array[0];
		int count = 0;
		int previousNumber = array[0];
		for(int i=1; i<array.length; i++) {
			if(array[i] == previousNumber) {
				count++;
				if(count > array.length/2)
					return array[i];
			} else {
				count = 1;
				previousNumber = array[i];
			}
		}
		return 0;
	}

	/****
	PLEASE NOTE : if we assume that the array always has a majority, sort the array and return the middle element.
	public int findMajorityElement(int[] arr) {
		if(arr.length == 1)
			return arr[0];
		Arrays.sort(arr);
		return arr[arr.length/2];
	}
	****/
}