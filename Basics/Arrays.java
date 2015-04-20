import java.io.*;
import java.util.*;

public class Arrays{

	public static void main(String args[]){

		System.out.println(">>> Arrays");
		try{
			// One dimensional Array
		
			int[] arr = new int[5]; // creating a new array initiallizes all the array values to 0
			System.out.println("Printing array : "+arr); // just printing the array name prints hash value
			for(int i =0; i<arr.length; i++)
				System.out.println(arr[i]);

			// aliasing - when we assign the array2 to another array1, both the arrays points to the same location in memory
			int[] arrr = arr;
			for(int i =0; i<arrr.length; i++)
				System.out.println(arrr[i]);

		}catch(Exception e){
			System.out.println("Exception caught");
			e.printStackTrace();
		}
	}
}