import java.io.*;
import java.util.*;

public class MinimumStepsToOne {

	public static int minStepsToOne(int num) {
		int[] dp = new int[num+1];

		// All elements are initialized to zero by default
		// for (int x : dp)
		// 	System.out.print(x + " ");
		// System.out.println();

		dp[1] = 0;
		for (int i=2; i<=num; i++) {
			dp[i] = 1 + dp[i-1];
			if (i%2 == 0)
				dp[i] = Math.min(dp[i], 1+dp[i/2]);
			if (i%3 == 0)
				dp[i] = Math.min(dp[i], 1+dp[i/3]);
			System.out.println("The value for location " + i + " is " + dp[i]);
		}
		return dp[num];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want to find the mininum steps to reach 1 : ");
		int num = scan.nextInt();
		int result = minStepsToOne(num);
		System.out.println("The mininum steps to reach one for " + num + " is : " + result);
	}
}