import java.io.*;
import java.util.*;

// Prints all possible combination of a letters in a word

class AnagramWordRecursion {
	static int size;
	static int count;
	static char[] arrChar = new char[100];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a word:");
		String input = br.readLine();
		size = input.length();
		count = 0;
		for(int i=0; i<size; i++) 
			arrChar[i] = input.charAt(i);
		doAnagrams(size);
	}

	public static void doAnagrams(int newSize) {
		if(newSize == 1)
			return;
		for(int j=0; j<newSize; j++) {
			doAnagrams(newSize-1);
			if(newSize ==2)
				displayWord();
			rotate(newSize);
		}
	}

	public static void rotate(int newSize) {
		int j;
		int position = size - newSize;
		char temp = arrChar[position];
		for(j=position+1; j<size; j++)
			arrChar[j-1] = arrChar[j];
		arrChar[j-1] = temp;
	}

	public static void displayWord() {
		if(count < 99)
			System.out.println(" ");
		if(count < 9)
			System.out.println(" ");
		System.out.println(++count + " ");
		for(int j=0; j<size; j++)
			System.out.print( arrChar[j] );
		System.out.print(" ");
		System.out.flush();
		if(count%6 == 0)
			System.out.println(" ");
	}
}