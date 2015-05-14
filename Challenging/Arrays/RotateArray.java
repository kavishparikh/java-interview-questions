import java.io.*;
import java.util.*;

public class RotateArray {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Enter the number of places to rotate ?");
		int num = in.nextInt();
		rotateArray(array, num); 
	}

	public static void rotateArray(int[] array, int num) {
		if(num > array.length)
			num = num%array.length;

		int[] result = new int[array.length];
		for (int i=0; i<num; i++)
			result[i] = array[array.length-num+i];
		
		int j=0;
		for (int i=num; i<array.length; i++) {
			result[i] = array[j];
			j++;
		}
		
		for (int i=0; i<result.length; i++)
			System.out.print(result[i] + "  ");
	}

}