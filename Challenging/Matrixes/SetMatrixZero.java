import java.io.*;
import java.util.*;

public class SetMatrixZero {

	public static void main(String args[]) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			System.out.println(">>> Set Matrix Zero");
			System.out.println("Please enter the number of rows and columns required for matrix :");
			int rows = Integer.parseInt(br.readLine());
			int columns = Integer.parseInt(br.readLine());

			int[][] matrix = new int[rows][columns];

			int k = 1;
			for(int i=0; i<rows; i++) {
				for(int j=0; j<columns; j++){
					matrix[i][j] = k++;
					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println();
			}

			matrix[2][2] = 0;

			setZeroes(matrix);

		}catch(Exception e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}

	}


	// setZeroes method
	public static void setZeroes(int[][] matrix) {

		boolean firstRowZero = false;
		boolean firstColumnZero = false;

		// identify if first row or columns zero or not
		for(int i=0; i<matrix.length; i++) {
			if(matrix[i][0] == 0) {
				firstColumnZero = true;
				break;
			}
		}

		for(int i=0; i<matrix[0].length; i++) {
			if(matrix[0][i] == 0) {
				firstRowZero = true;
				break;
			}
		}

		// set first row and column to zero
		for(int i=1; i<matrix.length; i++) {
			for(int j=1; j<matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		// use the above set first row and column to set entire row and column to zero
		for(int i=1; i<matrix.length; i++) {
			for(int j=1; j<matrix[0].length; j++) {
				if(matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		// set first row and column to zero
		if(firstRowZero == true) {
			for(int i=0; i<matrix[0].length; i++)
				matrix[0][i] = 0;
		}

		if(firstColumnZero == true) {
			for(int i=0; i<matrix.length; i++)
				matrix[i][0] = 0;
		}

		// printing the final matrix
		System.out.println("Final Result Matrix : ");
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		

	} 

}