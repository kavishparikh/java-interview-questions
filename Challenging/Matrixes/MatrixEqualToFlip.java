import java.io.*;
import java.util.*;

// Checking if the matrix is equal if rotated 180 degrees in any direction.

public class MatrixEqualToFlip {
	
	public static boolean isMatrixEqualToFlip(boolean[][] matrix) {
        if (matrix==null || matrix.length == 0 || matrix[0].length == 0) {
            return true;
        }
        
        int rowLength = matrix[0].length;
        int highInd = matrix.length/2;
        int lowInd = highInd - 1 + (matrix.length % 2);
        System.out.println("rowLength: " + rowLength + " high: "+ highInd + " low: " + lowInd);
        
        while (lowInd >= 0) {
            System.out.println("high: " + highInd + " lowInd: " + lowInd);
            for(int i=0; i < rowLength; i++) {
                System.out.println("Compare " + matrix[highInd][i] + " to " + matrix[lowInd][rowLength - 1 - i]);
                if (matrix[highInd][i] != matrix[lowInd][rowLength - 1-i]) {
                    return false;
                }
            }
            lowInd--;
            highInd++;
        }

        return true;
    }		

	public static void main(String[] args) {
		// int[][]	matrix = {
		// 	{1, 2, 3, 4, 5},
		// 	{6, 7, 8, 9, 10},
		// 	{11, 12, 13, 14, 15},
		// 	{16, 17, 18, 19, 20}
		// };

		boolean[][] matrix = {
			{true, false, false, false, true, true},
			{false, false, true, true, false, false},
			{true, true, false, false, false, true}
		};
		boolean result = isMatrixEqualToFlip(matrix);
		System.out.println(result?"The matrix is same when flipped":"The matrix is not same when flipped");
	}
}