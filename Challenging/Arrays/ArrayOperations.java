import java.io.*;
import java.util.*;

public class ArrayOperations {

	public static void main(String args[]) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			int[] testArray = {34, 345, 213, 466, 234, 875, 23, 134 };

			// Find maximum in array
			int max = testArray[0];
			for(int i=1; i<testArray.length; i++) {
				if(max < testArray[i])
					max = testArray[i];
			}
			System.out.println("Maximum number : "+ max);

			// Sum and average of array values
			int sum =0 ;
			for(int i=0; i<testArray.length; i++)
				sum += testArray[i];
			System.out.println("Array Sum : "+ sum);
			System.out.println("Array average : "+ (sum/testArray.length));	 	

			// Copy to another array
			int[] secondArray = new int[testArray.length];
			for(int i=0; i<testArray.length; i++) {
				secondArray[i] = testArray[i];
			}
			System.out.println("Second Array : "+ secondArray); // Prints the hashcode for Array
			System.out.println("Second Array : "+ Arrays.toString(secondArray)); // Prints the Array in single line

			// Reversing the array
			for(int i=0; i<=(testArray.length/2); i++) {
				int temp = testArray[i];
				testArray[i] = testArray[(testArray.length-1)-i];
				testArray[(testArray.length-1)-i] = temp;
			}
			System.out.println("The reversed array : "+ testArray);	
			System.out.println("The reversed array : "+ Arrays.toString(testArray));		

		} catch(Exception e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}

	}

}