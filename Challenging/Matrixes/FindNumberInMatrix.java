import java.io.*;
import java.util.*;

// Question : 	Assume a matrix of integers they are sorted in boh row and column vice .. how do u find a 
//			    given number from the matrix in a optimal way?
// Approach : 	Let the matrix is n*m matrix. Then O(n log m) solution is trivial (binary search in each row). 
//				There is a easy O(n+m) solution too. The idea is to start from upper right corner (mat[0][m-1]) 
//				and traverse toward lower left corner (mat[n-1][0]). On the way check each entry and depending 
//				on whether larger go left or down. If there is a solution you will find it on the way. Or you 
//				will arrive to a point where you can no longer move without going out of the matrix. Either way 
//				you will check at most O(n+m) entries thus the solution in O(n+m).


// The implemented method is different from the appraoch mentioned : TIME COMPLEXITY????? log(mn)
public class FindNumberInMatrix {

	public static boolean findNumber(int[][] matrix, int target) throws Exception {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			throw new Exception("Matrix is Invalid");
		}
		int rows = matrix.length;
		int columns = matrix[0].length;
		System.out.println("The number of rows : " + rows);
		System.out.println("The number of columns : " + columns);

		int start = 0;
		int end = rows * columns -1;
		
		int steps = 0;

		while (start <= end) {
			int mid = (start+end)/2;
			int midX = mid/columns;
			int midY = mid%columns;
			
			System.out.println("Mid : " + mid + " Mid X : " + midX + " Mid Y : " + midY);
			
			if(matrix[midX][midY] == target)
				return true;

			if(matrix[midX][midY] < target) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		int[][] sortedMatrix = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}
			// {17, 18, 19, 20},
			// {21, 22, 23, 24}
		};

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number you want to find in matrix : ");
		int num = scan.nextInt();
		boolean isPresent = findNumber(sortedMatrix, num);
		if(isPresent)
			System.out.println("Number found");
		else
			System.out.println("Number not found");
	}
}