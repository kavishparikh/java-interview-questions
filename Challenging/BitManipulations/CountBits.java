import java.io.*;
import java.util.*;

// Count the numbers of 1's in a binary 32 bit integer

// eg. number : 11 in binary is < 0000000000000000000000000001011 >

public class CountBits {

	public static Integer countNumberofBits(int num) {
		int count = 0;
		for (int i=1; i<33; i++) {
			if(count(num, i) == true)
				count++;
		}
		return count;
	}

	public static boolean count(int num, int shiftBy) {
		return (num & (1 << shiftBy)) != 0;
	}


	public static void main(String[] args) {
		int num = 11;
		System.out.println("Number of one's : " + countNumberofBits(num));
	}

}