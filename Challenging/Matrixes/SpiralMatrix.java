import java.io.*;
import java.util.*;

public class SpiralMatrix {

	// main method
	public static void main(String args[]) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			System.out.println("Enter the number of rows and columns for matrix");
			int rows  = Integer.parseInt(br.readLine());
			int columns = Integer.parseInt(br.readLine());

			int[][] matrix = new int[rows][columns];

			// filling up matrix
			int k=1;
			for(int i=0; i<rows; i++) {
				for(int j=0; j<columns; j++) {
					matrix[i][j] = k++;
					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println();
			}
			
			ArrayList<Integer> spiralmatrix = new ArrayList<Integer>();

			spiralmatrix = spiralOrder(matrix);

			System.out.println("\n\nThe spiral taversed matrix : " +spiralmatrix);

		}catch(Exception e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}

	}
	// main method ends here

	// spiralOrder - method which will traverse matrix in spiral order
	public static ArrayList<Integer> spiralOrder(int[][] matrix) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if(matrix == null || matrix.length == 0)
			return result;

		int m = matrix.length;
		int n = matrix[0].length;

		int x=0, y=0;

		while(m>0 && n>0) {

			// if the matrix has either 1 row or 1 column
			// this loop will also execute for the centre most element in the matrix, also for for the centre row, if condition arisis
			if(m==1) {
				for(int i=0; i<n; i++)
					result.add(matrix[x][y++]);
				break;
			} else if(n==1) {
				for(int i=0; i<m; i++)
					result.add(matrix[x++][y]);
				break;
			}

			// top - move right 
			for(int i=0; i<n-1; i++) {
				result.add(matrix[x][y++]);
			}

			//right - move down
			for(int i=0; i<m-1; i++) {
				result.add(matrix[x++][y]);
			}

			//bottom - move left
			for(int i=0; i<n-1; i++) {
				result.add(matrix[x][y--]);
			}

			// left - move up
			for(int i=0; i<m-1; i++){
				result.add(matrix[x--][y]);
			}
			
			x++;
			y++;
			m=m-2;
			n=n-2;

		}
		return result;
	}
	// spiralOrder method ends here

}