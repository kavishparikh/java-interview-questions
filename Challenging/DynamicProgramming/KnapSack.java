import java.io.*;
import java.util.*;

// Generates an instance of the 0/1 knapsack problem with N items
// and maximum weight W and solves it in time and space proportional
// to N * W using dynamic programming.


public class KnapSack {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of items you want : ");
		int num = Integer.parseInt(br.readLine());
		System.out.println("Enter the maximum weight of the Knapsack : ");
		int maxWeight = Integer.parseInt(br.readLine());

		int[] profit = new int[num+1];
		int[] weight = new int[num+1];

		// Generating Random instance
		for (int n=1; n<=num; n++) {
			profit[n] = (int)(Math.random() * 1000);
			weight[n] = (int)(Math.random() * maxWeight);
			System.out.println(profit[n] + " : " + weight[n]);
		}

		int[][] opt = new int[num+1][maxWeight+1];
		System.out.println("2D Matrix opt rows : " + opt.length + ", columns : " + opt[0].length);
		boolean[][] sol = new boolean[num+1][maxWeight+1];
		System.out.println("2D Matrix sol rows : " + sol.length + ", columns : " + sol[0].length);


		// opt[n][w] = max profit of packing items 1..n with weight limit w
        // sol[n][w] = does opt solution to pack items 1..n with weight limit w include item n?
		for (int n=1; n<=num; n++) {
			for (int w=1; w<=maxWeight; w++) {
				// Don't take item n
				int option1 = opt[n-1][w];
				// Take item n
				int option2 = Integer.MIN_VALUE;

				if (weight[n] <= w)
					option2 = profit[n] + opt[n - 1][w - weight[n]];

				// Select better of 2 operation
				opt[n][w] = Math.max(option1, option2);
				sol[n][w] = (option2 > option1);
			}
		}

		// Determine which items to take
		boolean[] take = new boolean[num+1];
		for (int n=num, w=maxWeight; n>0; n--) {
			if ( sol[n][w] ) {
				take[n] = true;
				w = w -weight[n];
			}
			else {
				take[n] = false;
			}
		}

		System.out.println( "Item" + "\t" + "Profit" + "\t" + "Weight" +"\t" + "Take" );
		for (int n=1; n<=num; n++) {
			System.out.println( n + "\t" + profit[n] + "\t" + weight[n] + "\t" + take[n] );
		}
	}

}
