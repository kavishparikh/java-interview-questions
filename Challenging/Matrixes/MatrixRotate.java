import java.io.*;
import java.util.*;

public class MatrixRotate {

	public static int[][] fillMatrix(int[][] originalMatrix) {
		int key =1;
		for(int i=0; i<originalMatrix.length; i++) {
			for(int j=0; j<originalMatrix[0].length; j++) {
				originalMatrix[i][j] = key++;
			}
		}
		return originalMatrix;
	}

	public static void printMatrix(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// Rotate matrix clockwise
	public static void rotateMatrix(int[][] matrix) {
		if(matrix == null || matrix.length == 0)
			return;
		// Naive Approach - Clockwise
		// int[][] result = new int[matrix.length][matrix[0].length];
		// for (int i=0; i<matrix.length ; i++) {
		// 	for (int j=0; j<matrix[0].length; j++) {
		// 		result[j][matrix.length-1-i] = matrix[i][j];
		// 	}
		// }

		// Naive Approach - Anti - Clockwise
		// int[][] result = new int[matrix.length][matrix[0].length];
		// for (int i=0; i<matrix.length ; i++) {
		// 	for (int j=0; j<matrix[0].length; j++) {
		// 		result[matrix.length-1-j][i] = matrix[i][j];
		// 	}
		// }
		
		// Better In-place solution - no extra matrix
		int n = matrix.length;
		for(int i=0; i<(n/2); i++) {
			for(int j=0; j<Math.ceil( ((double)n/2.0) ); j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}

		System.out.println("Printing Clockwise Rotated Matrix : ");
		printMatrix(matrix);
	}

	// Transpose matrix
	public static void transposeMatrix(int[][] matrix) {
		if(matrix == null || matrix.length == 0)
			return;
		int[][] result = new int[matrix.length][matrix[0].length];
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++)
				result[j][i] = matrix[i][j];
		}
		System.out.println("Printing Transposed Matrix : ");
		printMatrix(result);
	}

	public static void multiplyMatrix() {}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the number of rows and columns required ? ");
			int rows = Integer.parseInt(br.readLine());
			int column = Integer.parseInt(br.readLine());
			
			//int[][] originalMatrix = new int[rows][column];
			//originalMatrix = fillMatrix(originalMatrix);

			System.out.println(Math.ceil((double)4/2.0));
			
			int[][] originalMatrix = fillMatrix(new int[rows][column]);
			System.out.println("Printing Original Matrix : ");
			printMatrix(originalMatrix);

			transposeMatrix(originalMatrix);

			rotateMatrix(originalMatrix);

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

