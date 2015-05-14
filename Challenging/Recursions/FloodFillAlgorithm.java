import java.io.*;
import java.util.*;

// Flood fill algorithm :   Flood fill, also called seed fill, is an algorithm that determines 
// 							the area connected to a given node in a multi-dimensional array. It 
//							is used in the 'bucket' fill tool of paint programs to fill connected, 
//							similarly-colored areas with a different color, and in games such as Go 
//							and Minesweeper for determining which pieces are cleared. When applied 
//							on an image to fill a particular bounded area with color, it is also known 
//							as boundary fill. Here ‘P’ is for passage, ‘O’ for obstacle and ‘W’ for water flow. 

/**
 * Java Program to Implement Flood Fill Algorithm
 **/
 
public class FloodFillAlgorithm {
    
    private void fillGrid(char[][] arr, int sr, int sc) 
    {
        if (arr[sr][sc] == 'P')
        {
            arr[sr][sc] = 'W';
            display(arr);
 
 			// 4 way recursive method
            fillGrid(arr, sr + 1, sc);
            fillGrid(arr, sr - 1, sc);
            fillGrid(arr, sr, sc + 1);
            fillGrid(arr, sr, sc - 1);
            
            // 8 way recursive method
            // fillGrid(arr, sr + 1, sc);
            // fillGrid(arr, sr - 1, sc);
            // fillGrid(arr, sr, sc + 1);
            // fillGrid(arr, sr, sc - 1);
            // fillGrid(arr, sr + 1, sc - 1);
            // fillGrid(arr, sr - 1, sc + 1);
            // fillGrid(arr, sr + 1, sc + 1);
            // fillGrid(arr, sr - 1, sc - 1);
        }
    }
    
    private void display(char[][] arr)
    {
        System.out.println("\nGrid : ");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] +" ");
            System.out.println();
        }
    }
 
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );        
        FloodFillAlgorithm ff = new FloodFillAlgorithm();
        
        System.out.println("Flood Fill Test\n");
 
        /** Accept dimensions **/
        System.out.println("Enter dimensions of grid");
        int M = scan.nextInt();
        int N = scan.nextInt();
 
        /** make grid with border as obstacle to avoid boundary conditions **/
        char[][] arr = new char[M + 2][N + 2];
        for (int i = 0; i < M + 2; i++)
        	Arrays.fill(arr[i], 'O'); // Fills every column with 'O'
        ff.display(arr);
        
 		/** Accept grid **/
        System.out.println("Enter grid with 'P' for passage and 'O' for obstacle");
 
        for (int i = 1; i < M + 1; i++)
            for (int j = 1; j < N + 1; j++)
                arr[i][j] = scan.next().charAt(0);    
 
        System.out.println("Enter coordinates to start ");
        int sr = scan.nextInt();
        int sc = scan.nextInt();
 
        if (arr[sr][sc] != 'P')
        {
            System.out.println("Invalid coordinates");
            System.exit(0);
        }
 
        ff.fillGrid(arr, sr, sc);    
 
    }    
}