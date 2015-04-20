import java.io.*;
import java.util.*;

// There are numbers appearing twice in an array, find the number wich appears only once


public class OddManOut {


// we use XOR function, because XOR returns 1 only when 2 bits are different, thus when the numbrs are
// repeating twice, they nullify each other and only  the single value remains

	public static Integer singleNumber(int[] arr1) {
		int result = 0;

		for(int a : arr1) {
			result = result ^ a;
		}

		return result;
	}


// This method is an extension to the above method, here we need to find the a number appearing once, where other numbers appears thrice

// Don't understand this logic, this is still on to do list, please understand if you are reading it.	
	
	public static Integer singleNumberFromThrice(int[] arr2) {
		int ones = 0, twos = 0, threes = 0;
    	for (int i = 0; i < arr2.length; i++) {
	        twos |= ones & arr2[i];
	        ones ^= arr2[i];
	        threes = ones & twos;
	        ones &= ~threes;
	        twos &= ~threes;
    	}
    	return ones;
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4 ,5, 6, 7, 1, 2, 3, 4, 5, 6};
		System.out.println("The single number : " + singleNumber(arr1)); // 7

		int[] arr2 = {1, 2, 3, 1, 2, 1, 2};
		System.out.println("The single number : " + singleNumberFromThrice(arr2));
	}

}