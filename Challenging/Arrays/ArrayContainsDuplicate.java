import java.io.*;
import java.util.*;

public class ArrayContainsDuplicate {

	public static void main(String args[]) {

		System.out.println(">>> Find if Array contains duplicate values");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			int[] numberList = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

			boolean duplicate = findIfDuplicate(numberList);

			if(duplicate == true) 
				System.out.println("The Array has duplicate content");
			else
				System.out.println("The Array has no duplicate content");

		} catch(Exception e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}

	}

	public static boolean findIfDuplicate(int[] numberList) {

		Set<Integer> numbers = new HashSet<Integer>();
		// Used the short for loop
		for(int i : numberList) {
			if(numbers.contains(numberList[i]))
				return true;
			numbers.add(numberList[i]);
		}
		// NOTE: The above for loop can also be implemented in following manner
		// for(int i : numberList) {
		// 	if(numbers.contains(i) // This gets the content at location 'i'
		// 		return true;
		// 	numbers.add(i); // This stores the content at location 'i'
		// }
		return false;

	}

}