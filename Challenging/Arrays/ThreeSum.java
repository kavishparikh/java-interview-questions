import java.io.*;
import java.util.*;

public class ThreeSum {

	public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(num.length < 3) {
			return null;
		}

		Arrays.sort(num);
		for (int i=0; i<num.length - 2; i++) {
			if(i==0 || num[i] > num[i-1]) {
				int negate = -num[i];
				int start = i+1;
				int end = num.length-1;
				while(start < end) {
					// CASE 1
					if(num[start] + num[end] == negate) {
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[start]);
						temp.add(num[end]);
						result.add(temp);
						start++;
						end--;
						while(start<end && num[end] == num[end+1])
							end--;
						while(start<end && num[start] == num[start-1])
							start++;
					} else if(num[start] + num[end] < negate) {
						start++;
					} else {
						end--;
					}
				}
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int[] num = {-1, 0, 1, 2, -1, 4};
		System.out.println("Solution Set : \n" + threeSum(num));	
	}

}