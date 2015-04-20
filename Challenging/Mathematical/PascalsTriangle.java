import java.io.*;
import java.util.*;

public class PascalsTriangle {

	public static void main(String ars[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the numbers of rows for Pascals Triangle : ");
			int number = Integer.parseInt(br.readLine());
			printPascalTriangle(number);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void printPascalTriangle(int numRows) {
		if(numRows < 0)
			return;
		int[] previousRow;
		int[] currentRow = {1};
		printArray(currentRow);
		previousRow = currentRow;
		for(int i=2; i<=numRows; i++) {
			currentRow = new int[i];
			currentRow[0] = 1;
			currentRow[i-1] = 1;
			for(int j=0; j<=i-3; j++)
				currentRow[j+1] = previousRow[j] + previousRow[j+1];
			printArray(currentRow);
			previousRow = currentRow;
		}
	}

	public static void printArray(int[] currentRow) {
		for(int i=0; i<currentRow.length; i++)
			System.out.print(currentRow[i] + "\t");
		System.out.println();
	}
}

/****
SAMPLE OUTPUT :
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
****/