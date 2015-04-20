import java.io.*;
import java.util.*;

public class BestTimeBuySellStock {

	public static int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0)
			return 0;
		int profits = 0;
		int minElement = Integer.MAX_VALUE;
		for (int i=0; i<prices.length; i++) {
			profits = Math.max(profits, prices[i] - minElement);
			minElement = Math.min(minElement, prices[i]);
		}
		return profits;
	}

	public static void main(String[] args) {
		int[] prices = {345, 532, 135, 7346, 5235, 134};
		System.out.println("Maximum Profit : " + maxProfit(prices));
	}

}