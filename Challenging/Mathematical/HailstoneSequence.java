import java.io.*;
import java.util.*;

// Approach : 	The Hailstone sequence of numbers can be generated from a starting positive integer, n by:
//				If n is 1 then the sequence ends.
//				If n is even then the next n of the sequence = n/2
//				If n is odd then the next n of the sequence = (3 * n) + 1

public class HailstoneSequence {
	public static void sequence(int number) throws Exception {
		if(number < 0)
			throw new Exception("Number should be positive");
		if(number == 1) {
			System.out.println("Hailstone sequence : 1");
			return;
		}
		
		int steps = 0;
		ArrayList<Integer> sequenceNumbers = new ArrayList<Integer>();
		
		while (number != 1) {
			if (number%2 == 0) {
				System.out.println(number + " is even so i take half : " + number/2);
				number/=2;
				sequenceNumbers.add(number);
			} else {
				System.out.println(number + " is odd so i make 3(number)+1 : " + (3*number+1));
				number = (3*number)+1;	
				sequenceNumbers.add(number);
			}
			steps++;
		}
		
		System.out.println("The process took " + steps + (steps<2?" step" : " steps") + " to reach 1");	
		System.out.println(sequenceNumbers);
	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a number to start hailstone sequence from : ");
			int num = Integer.parseInt(br.readLine());
			sequence(num);
		} catch(Exception e) {
			System.out.println("Not a number, run program again!");
			e.printStackTrace();
		}
	}
}