import java.io.*;
import java.util.*;

public class FourSum {

	public static ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
		Arrays.sort(num);

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();

		for (int i=0; i<num.length; i++) {
			for (int j=i+1; j<num.length; j++) {
				int k = j+1;
				int l = num.length - 1;

				while(k < l) {
					int sum = num[i] + num[j] + num[k] + num[l];
					if(sum > target) {
						l--;
					} else if(sum < target) {
						k++;
					} else if(sum == target) {
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[j]);
						temp.add(num[k]);
						temp.add(num[l]);
						if(!set.contains(temp)) {
							set.add(temp);
							result.add(temp);
						}
						k++;
						l--;
					}
				}				
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] num = {1, 0, -1, 0, -2, 2};
		System.out.println("Solution Set : " + fourSum(num, 0));	
	}

}