import java.io.*;
import java.util.*;

public class TowersOfHanoi {
	static int nDisks = 3;

	public static void main(String args[]) {
		solveTowers(nDisks, 'A', 'B', 'C');
	}

	public static void solveTowers(int n, char from, char inter, char to) {
		if(n == 1) {
			System.out.println("Step 1 :: n = " + n + "from = " + from + " : inter = " + inter + " : to = " + to);
			System.out.println("\t --> Disk 1 from " + from + " to " + to);
			System.out.println();
		} else {
			System.out.println("Step 2 :: n = " + n + " from = " + from + " : inter = " + inter + " : to = " + to);
			solveTowers(n-1, from, to, inter);

			System.out.println("Step 3 :: n = " + n + " from = " + from + " : inter = " + inter + " : to = " + to);
			System.out.println("\t --> Disk " + n + " from " + from + " to " + to);
			System.out.println();

			System.out.println("Step 4 :: n = " + n + " from = " + from + " : inter = " + inter + " : to = " + to);
			solveTowers(n-1, inter, from, to);
		}
	}
}