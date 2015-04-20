import java.io.*;
import java.util.*;

public class CandyMinimum {

	public static int calculateMinimumCandies(int[] ratings) {
		if(ratings == null || ratings.length == 0)
			return 0;
		
		int[] candies = new int[ratings.length];
		candies[0] = 1;
		
		// going left to right
		for(int i=1; i<ratings.length; i++) {
			if(ratings[i] > ratings[i-1]) {
				candies[i] = candies[i-1]+1;
			} else {
				candies[i] = 1;
			}
		}
		int result = candies[ratings.length -1];

		// going right to left
		for(int i=ratings.length-2; i>=0; i--) {
			int cur = 1;
			if(ratings[i] > ratings[i+1])
				cur = candies[i+1]+1;
			result += Math.max(candies[i], cur);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] ratings = {2, 7, 8, 1, 5, 6, 8, 9};
		int total = calculateMinimumCandies(ratings);
		System.out.println("Minimum number of candies required : " + total);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MA_XVALUE);
	}

}