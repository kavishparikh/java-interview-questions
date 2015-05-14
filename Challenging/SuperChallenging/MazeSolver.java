/*  Chris Poon

	Backtracking/recursion to solve a maze.

	The program will output all the paths it finds and then output (again)
	in the end the last shortest path found.

	
	I found it easiest to simply hardcode the maze in the variables below.
	It is IMPORTANT to note there is no error checking.  So if the end
	state is unreachable, an unexpected result/crash is likely.

*/


import java.io.*;

public class MazeSolver 
{
	/*the below variables are the "INPUT" variables*/
	static int numrows=10;		static int numcols=10;
	static int startrow=5;		static int startcol=3;
    static int endrow=1;		static int endcol=6;
	
	static 	int myMaze[][]={
							{1,1,1,1,1,1,1,1,1,1},  /*  1 = wall  */
							{1,0,0,1,0,0,0,1,0,1},  /*  0 = space */
							{1,0,1,1,1,0,1,1,0,1},
							{1,0,0,0,0,0,0,0,0,1},
							{1,0,1,0,1,1,0,1,1,1},
							{1,0,0,0,0,1,0,0,0,1},
							{1,0,1,1,1,0,0,1,1,1},
							{1,0,1,1,1,1,0,1,0,1},
							{1,0,0,0,0,0,0,0,0,1},
							{1,1,1,1,1,1,1,1,1,1}
						};

	/*these two variables keep track of the shortest path found so far*/
	static 	int shortestpath[] = new int[numrows*numcols];
	static 	int shortestlength;

	/*******************************************************************/
	
	boolean beenhere(int row, int col, int pathsofar[], int lengthsofar){
		/*this private boolean function tells if this spot (row,col) has
		  been visited before*/
		 
		int x;
		int target = row * numcols + col;  /*this computation gives a unique
										id to each maze square*/

		for (x=0; x<lengthsofar; x++)
			if (pathsofar[x] == target) 
				return true;

		return false;
	}

	/*******************************************************************/
	
	public void showmypath(int mypath[], int mylength){
		/*this function prints out the maze and the path traveled so
		  far.*/

		int r,c;

		for (r=0;r<numrows;r++) {
			for (c=0;c<numcols;c++) {
				if (myMaze[r][c]==1)
					System.out.print("|");			     /*  | for walls   */
				else if (r==startrow && c==startcol)
					System.out.print("S");			     /*  S for start   */
				else if (r==endrow && c==endcol)
					System.out.print("X");			     /*  X for exit   */
				else if (beenhere(r,c,mypath,mylength))
					System.out.print("o");			     /*  o for traveled   */
				else
					System.out.print(" ");			     /*    empty space  */
			}
			System.out.println("");
		}
	}
	/*******************************************************************/
	public void findpath(int row, int col, int pathsofar[], int lengthsofar){
		/*This is the recursive function that finds the paths.  When it
			does find a valid path, it outputs it then stores it into
			shortestpath if is is shorter that what is currently held*/

		/*These 3 statements are the termination conditions:
			out of bounds,  wall, and previously visited, respectively*/
		if ( row<0 || col<0 || row>=numrows || col>=numcols )
			return;
		if ( myMaze[row][col]==1 ) 
			return;
		if ( beenhere(row, col, pathsofar, lengthsofar) ) 
			return;

		int mypath[] = new int[lengthsofar+1];

		System.arraycopy(pathsofar, 0, mypath, 0, lengthsofar);  
			/*for local copy for proper backtracking*/
							
		
		mypath[lengthsofar++] = row*numcols+col;  /*adds this square to
													traveled path*/

		if ( row==endrow && col==endcol ) {		
			/*Reached the end, thus finding a valid path*/

			System.out.println("Found path of length "+lengthsofar+"!:");
			showmypath(mypath, lengthsofar);

			if (lengthsofar<=shortestlength){ /*New shortest path?*/
				shortestlength=lengthsofar;
				System.arraycopy(mypath, 0, shortestpath, 0, lengthsofar);
				System.out.println(" (New shortest path of length " + lengthsofar + ")");
			}
			System.out.println("");
			return;
		}

		/*Below, recursively call to go to other squares*/
		findpath(row-1, col, mypath, lengthsofar);
		findpath(row, col-1, mypath, lengthsofar);
		findpath(row, col+1, mypath, lengthsofar);
		findpath(row+1, col, mypath, lengthsofar);
	}
			
	/*******************************************************************/
	public static void main(String[] args) 
	{
		/* The main function initializes appropriate variables,
			outputs the initial maze, finds the path, and outputs it*/

		int r,c,x;				/*various counters*/
		int pathsofar[];		/*Path to get started with*/
		int lengthsofar;		/*length to get started with*/

		MazeSolver daMaze = new MazeSolver();	  /*the maze object*/

		pathsofar = new int[daMaze.numrows*daMaze.numcols];  /*for max size*/
		
		for (x=0; x<daMaze.numrows*daMaze.numcols; x++){
			daMaze.shortestpath[x]=-1;  /* initializing the path arrays*/
			pathsofar[x]=-1;
		}

		/*initial lengths*/
		daMaze.shortestlength = daMaze.numrows*daMaze.numcols+1;
		lengthsofar = 0;

		System.out.println("Here's the maze:");
		for (r=0; r<daMaze.numrows; r++) {
			for (c=0; c<daMaze.numcols; c++) {
				if (r==startrow && c==startcol)		/*outputing the initial*/
					System.out.print("S");			/* maze state*/
				else if (r==endrow && c==endcol)
					System.out.print("x");
				else if (daMaze.myMaze[r][c]==0)
					System.out.print(" ");
				else System.out.print("|");
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("Finding Paths...");

		daMaze.findpath(startrow, startcol, pathsofar, lengthsofar);

		System.out.println("");
		System.out.println("The shortest path found was the following of length "+ daMaze.shortestlength);
		daMaze.showmypath(daMaze.shortestpath, daMaze.shortestlength);

	}
}


// ROSETTA CODE SOLUTION for MazeSolver

// import java.io.*;
// import java.util.*;
 
// public class MazeSolver
// {
//     /**
//      * Reads a file into an array of strings, one per line.
//      */
//     private static String[] readLines (InputStream f) throws IOException
//     {
//         BufferedReader r =
//             new BufferedReader (new InputStreamReader (f, "US-ASCII"));
//         ArrayList<String> lines = new ArrayList<String>();
//         String line;
//         while ((line = r.readLine()) != null)
//             lines.add (line);
//         return lines.toArray(new String[0]);
//     }
 
//     /**
//      * Makes the maze half as wide (i. e. "+---+" becomes "+-+"), so that
//      * each cell in the maze is the same size horizontally as vertically.
//      * (Versus the expanded version, which looks better visually.)
//      * Also, converts each line of the maze from a String to a
//      * char[], because we'll want mutability when drawing the solution later.
//      */
//     private static char[][] decimateHorizontally (String[] lines)
//     {
//         final int width = (lines[0].length() + 1) / 2;
//         char[][] c = new char[lines.length][width];
//         for (int i = 0  ;  i < lines.length  ;  i++)
//             for (int j = 0  ;  j < width  ;  j++)
//                 c[i][j] = lines[i].charAt (j * 2);
//         return c;
//     }
 
//     /**
//      * Given the maze, the x and y coordinates (which must be odd),
//      * and the direction we came from, return true if the maze is
//      * solvable, and draw the solution if so.
//      */
//     private static boolean solveMazeRecursively (char[][] maze,
//                                                  int x, int y, int d)
//     {
//         boolean ok = false;
//         for (int i = 0  ;  i < 4  &&  !ok  ;  i++)
//             if (i != d)
//                 switch (i)
//                     {
//                         // 0 = up, 1 = right, 2 = down, 3 = left
//                     case 0:
//                         if (maze[y-1][x] == ' ')
//                             ok = solveMazeRecursively (maze, x, y - 2, 2);
//                         break;
//                     case 1:
//                         if (maze[y][x+1] == ' ')
//                             ok = solveMazeRecursively (maze, x + 2, y, 3);
//                         break;
//                     case 2:
//                         if (maze[y+1][x] == ' ')
//                             ok = solveMazeRecursively (maze, x, y + 2, 0);
//                         break;
//                     case 3:
//                         if (maze[y][x-1] == ' ')
//                             ok = solveMazeRecursively (maze, x - 2, y, 1);
//                         break;
//                     }
//         // check for end condition
//         if (x == 1  &&  y == 1)
//             ok = true;
//         // once we have found a solution, draw it as we unwind the recursion
//         if (ok)
//             {
//                 maze[y][x] = '*';
//                 switch (d)
//                     {
//                     case 0:
//                         maze[y-1][x] = '*';
//                         break;
//                     case 1:
//                         maze[y][x+1] = '*';
//                         break;
//                     case 2:
//                         maze[y+1][x] = '*';
//                         break;
//                     case 3:
//                         maze[y][x-1] = '*';
//                         break;
//                     }
//             }
//         return ok;
//     }
 
//     /**
//      * Solve the maze and draw the solution.  For simplicity,
//      * assumes the starting point is the lower right, and the
//      * ending point is the upper left.
//      */
//     private static void solveMaze (char[][] maze)
//     {
//         solveMazeRecursively (maze, maze[0].length - 2, maze.length - 2, -1);
//     }
 
//     /**
//      * Opposite of decimateHorizontally().  Adds extra characters to make
//      * the maze "look right", and converts each line from char[] to
//      * String at the same time.
//      */
//     private static String[] expandHorizontally (char[][] maze)
//     {
//         char[] tmp = new char[3];
//         String[] lines = new String[maze.length];
//         for (int i = 0  ;  i < maze.length  ;  i++)
//             {
//                 StringBuilder sb = new StringBuilder(maze[i].length * 2);
//                 for (int j = 0  ;  j < maze[i].length  ;  j++)
//                     if (j % 2 == 0)
//                         sb.append (maze[i][j]);
//                     else
//                         {
//                             tmp[0] = tmp[1] = tmp[2] = maze[i][j];
//                             if (tmp[1] == '*')
//                                 tmp[0] = tmp[2] = ' ';
//                             sb.append (tmp);
//                         }
//                 lines[i] = sb.toString();
//             }
//         return lines;
//     }
 
//     /**
//      * Accepts a maze as generated by:
//      * http://rosettacode.org/wiki/Maze_generation#Java
//      * in a file whose name is specified as a command-line argument,
//      * or on standard input if no argument is specified.
//      */
//     public static void main (String[] args) throws IOException
//     {
//         InputStream f = (args.length > 0
//                          ?  new FileInputStream (args[0])
//                          :  System.in);
//         String[] lines = readLines (f);
//         char[][] maze = decimateHorizontally (lines);
//         solveMaze (maze);
//         String[] solvedLines = expandHorizontally (maze);
//         for (int i = 0  ;  i < solvedLines.length  ;  i++)
//             System.out.println (solvedLines[i]);
//     }
// }