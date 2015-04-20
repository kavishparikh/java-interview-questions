import java.io.*;
import java.util.*;

public class MatrixOperation {

	public static void main(String args[]) {

		System.out.println(">>> Matrix Operatins ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Enter the number of rows and columns you need in a matrix :");
			int rows = Integer.parseInt(br.readLine());
			int columns = Integer.parseInt(br.readLine());

			int[][] matrix = new int[rows][columns];
			int k = 1;
			
			// this will fill up matrix in sequential order
			for(int i = 0; i<rows; i++) {
				for(int j = 0; j<columns; j++) {
					matrix[i][j] = k++;
					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println();
			}

			// transposing the matrix
			System.out.println("\nMatrix transpose");
			int[][] transpose = new int[columns][rows];
			for(int i=0; i<columns; i++) {
				for(int j=0; j<rows; j++) {
					transpose[i][j] = matrix[j][i];
					System.out.print(transpose[i][j] + "\t");
				}
				System.out.println();
			}

			System.out.println("The length the of the matrix : " + matrix.length + " also, " + matrix[0].length + " also, " + matrix);

		} catch(Exception e){
			System.out.println("Exception Caught");
			e.printStackTrace();
		}


	}

}