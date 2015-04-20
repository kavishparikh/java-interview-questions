import java.io.*;
import java.util.*;

public class EmmaAndSquare {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of test cases : ");
		int testCases = Integer.parseInt(br.readLine());
		
		System.out.println("Enter starting number : ");
		int intStart = Integer.parseInt(br.readLine());
		
		System.out.println("Enter ending number : ");
		int intEnd = Integer.parseInt(br.readLine());
		
		System.out.println("Test cases : " + testCases);
		System.out.println("Number start : " + intStart);
		System.out.println("Number end : " + intEnd);

		if ( 1 <= testCases && testCases <= 100) {
			if( (1<=intStart && intStart<=1000000000) && (1<=intEnd && intEnd<=1000000000) {
				int squareIntegers = 0;
				for(int num=intStart; num<=intEnd; num++) {
					int sqroot = (int)Math.sqrt(num);
					if(sqroot*sqroot == num) {
						squareIntegers++;
						System.out.print(num + "\t");
					}
				else
					continue;
				}
				System.out.println("\nTotal square integers : " + squareIntegers);	
			}
		}
	}
}


// Calculating square root without Math.sqrt
// for(int i=1; i<(n/2); i++)
// {
//     if((i*i) == n)
//     {
//         sq = i;
//         break;
//     }
// }
// if(sq == 0) System.out.println("Not a perfect square");
// else System.out.println("Square root = " + sq);






// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

// System.out.print("Please enter an integer : ");

// int number = Integer.parseInt(reader.readLine());
// int sqrt = (int) Math.sqrt(number);
// if(sqrt*sqrt == number) {
//     System.out.println(number+" is a perfect square number!");
// }else {
//     System.out.println(number+" is NOT a perfect square number!");
// }
