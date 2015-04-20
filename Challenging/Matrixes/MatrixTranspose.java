import java.io.*;
import java.util.*;

public class MatrixTranspose{

	public static void main(String args[]){

		try{
			System.out.println("Implementing Matrix Transpose");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the number of rows and columns you want");
			int rows = Integer.parseInt(br.readLine());
			int columns = Integer.parseInt(br.readLine());

			int[][] matrix = new int[rows][columns];

			System.out.println("Generating Matrix");

			// storing values in the matrix
			int counter = 1;
			for(int i=0; i<rows; i++){
				for(int j=0; j<columns; j++){
					matrix[i][j] = counter;
					counter++;
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
				
			
			// transposing matrix
			int transpose[][] = new int[columns][rows];
			System.out.println("Creating a matrix transpose");
			for(int i=0; i<rows; i++){
				for(int j=0; j<columns; j++){
					transpose[j][i] = matrix[i][j];
					//counter++;
					System.out.print(transpose[j][i] + " ");
				}
				System.out.println();
			}


			// the final output
			System.out.println("The transposed matrix");
			for(int i=0; i<columns; i++){
				for(int j=0; j<rows; j++){
					System.out.print(transpose[i][j] + " ");
				}
				System.out.println();
			}


		}catch(Exception e){
			System.out.println("Exception caught");
			e.printStackTrace();
		}

	}

}