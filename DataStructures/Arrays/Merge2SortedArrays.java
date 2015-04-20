import java.io.*;
import java.util.*;

public class Merge2SortedArrays{

	public static void main(String args[]) {

		int[] arrA = {23, 47, 81, 95};
		int[] arrB = {7, 14, 39, 55, 62, 74};

		int sA = arrA.length;
		int sB = arrB.length;
		int arrC[] = new int[sA + sB];
		mergeArray(arrA, arrB, arrC, 4, 6);
	}

	public static void mergeArray(int[] arrA, int[] arrB, int[] arrC, int sa, int sb) {
		int ad=0, bd=0, cd=0;

		while(ad <sa && bd <sb) {
			if(arrA[ad] < arrB[bd])
				arrC[cd++] = arrA[ad++];
			else
				arrC[cd++] = arrB[bd++];
		}
		while(ad < sa)
			arrC[cd++] = arrA[ad++];
		while(bd < sb)
			arrC[cd++] = arrA[bd++];

		for(int x : arrC)
			System.out.print(x+" ");
	}
}