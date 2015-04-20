import java.io.*;
import java.util.*;

// There is an output, but the solution is not correct

public class LargestNumberFormation {
	
	public static String largestNumber(int[] numbers) {
		String[] num = new String[numbers.length];

		for (int i=0; i<num.length; i++) {
			num[i] = String.valueOf(numbers[i]);
		}

		Arrays.sort(num, new Comparator<String>() {
			public int compare(String left, String right) {
				String leftRight = left.concat(right);
				String rightLeft = right.concat(left);
				return leftRight.compareTo(rightLeft);
			}
		});

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<num.length; i++) {
			sb.append(num[i]);
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		int[] numbers = {34, 54, 4123, 32, 43};
		System.out.println("Largest Number : " + largestNumber(numbers));		
	}

}