import java.io.*;
import java.util.*;

public class MinimumCharMovement {

	public static int findMinimumSwapMovement(String string1, String string2) {
		
		int moves = 0;
		char[] string1Char = string1.toCharArray();
		char[] string2Char = string2.toCharArray();
		char tempChar;

		if (string1 != string2) {

			for (int i = 0; i < string1Char.length; i++) {

				for (int j = i + 1; j < string1Char.length; j++) {

					if (string1Char[i] != string2Char[i]) {
						/****
						trying to check if some character from string1Char matches other charachter of string2Char
						if true with condition, swap and incremnt swap count
						****/
						if (string1Char[j] == string2Char[i] && j < string1Char.length) {
							for (int k = j; k > i; k--) {
								tempChar = string1Char[k];
								string1Char[k] = string1Char[k - 1];
								string1Char[k - 1] = tempChar;
								moves++;
							}
							/****
							if the last character of array string1Char same as the some character of string2Char and
							vice versa, then we should check if the i is equal to 0, in that case we swap 1st and last
							character of array and count as 1 move else if i value is less then the value of length of array
							divided with 2 then it swaps that character to the first one and then swaps with last and counts
							the moves
							****/
						} else if (string1Char[string1Char.length - 1] == string2Char[i]) {
							if (i == 0) {
								// replacing the last character of string1 with first character of string2
								tempChar = string1Char[string1Char.length - 1];
								string1Char[string1Char.length - 1] = string1Char[i];
								string1Char[i] = tempChar;
								moves++;
							} else if (i < (string1Char.length - 1) / 2) {
								for (int k = i; k > 0; k--) {
									tempChar = string1Char[k];
									string1Char[k] = string1Char[k - 1];
									string1Char[k - 1] = tempChar;
									moves++;
								}
								tempChar = string1Char[i];
								string1Char[i] = string1Char[string1Char.length - 1];
								string1Char[string1Char.length - 1] = tempChar;
							}
						} else if (string2Char[string2Char.length - 1] == string1Char[i]) {
							if (i == 0) {
								tempChar = string2Char[string2Char.length - 1];
								string2Char[string2Char.length - 1] = string2Char[i];
								string2Char[i] = tempChar;
								moves++;
							} else if (i < (string1Char.length - 1) / 2) {
								for (int k = i; k > 0; k--) {
									tempChar = string1Char[k];
									string1Char[k] = string1Char[k - 1];
									string1Char[k - 1] = tempChar;
									moves++;
								}
								tempChar = string1Char[i];
								string1Char[i] = string1Char[string1Char.length - 1];
								string1Char[string1Char.length - 1] = tempChar;
								moves++;
							}
							/*
							 * And the last case is if there is no other option,
							 * then we asks if some characters in array with
							 * positions i and j are different and if the j
							 * value is less then length of the array and do the
							 * swap.
							 */
						} else {
							if (string1Char[j] != string1Char[i] && j < string1Char.length) {
								if (string1Char[j] == string2Char[j]) {
									tempChar = string2Char[j];
									string2Char[j] = string2Char[i];
									string2Char[i] = tempChar;
									moves++;
								}
								tempChar = string1Char[j];
								string1Char[j] = string1Char[i];
								string1Char[i] = tempChar;
								moves++;
							} else if (string2Char[j] != string2Char[i] && j < string1Char.length) {
								if (string1Char[j] == string2Char[j]
										&& string1Char[j] != string1Char[i]) {
									tempChar = string1Char[j];
									string1Char[j] = string1Char[i];
									string1Char[i] = tempChar;
									moves++;
								}
								tempChar = string2Char[j];
								string2Char[j] = string2Char[i];
								string2Char[i] = tempChar;
								moves++;
							}
						}
						
						if (string1Char == string2Char) {
							break;
						}
					}
				}
			}
		}
		return moves;
	}

	public static void main(String args[]) {
		String a = "hetvi";
		String b = "ethiv";
		if(a.length > 2000 || b.length>2000) {
			System.out.println("The size of string exceeds 2000, program will close now.");
			System.exit(0);
		}
		int swaps = findMinimumSwapMovement(a, b);
		System.out.println(swaps);
	}

}

