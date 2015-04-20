import java.io.*;
import java.util.*;

public class MatrixMultiplication{

	public static void main(String args[]){

		System.out.println(">>> Matrix Multiplication");

		try{
			int[][] arrA = new int[3][3];
			int[][] arrB = new int[3][3];
			int[][] arrC = new int[3][3];
			int num = 0;
			// filling up both matrix
			for(int i = 0; i<3; i++){
				for(int j=0; j<3;j++){
					num++;
					arrA[i][j] = num;
					arrB[i][j] = num;
				}
			}

			// Multiplying matrix
			for(int i = 0; i<3; i++){
				for(int j=0; j<3;j++){
					for(int k=0; k<3; k++)
						arrC[i][j] += arrA[i][k]*arrB[k][j];
				}
			}

			// printing matrix
			for(int i = 0; i<3; i++){
				for(int j=0; j<3;j++){
					System.out.print(arrC[i][j]+"\t");
				}
				System.out.println();
			}

		}catch(Exception e){
			System.out.println("Exception Caught");
			e.printStackTrace();
		}

	}

}