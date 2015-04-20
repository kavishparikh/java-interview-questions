import java.io.*;
import java.util.*;

public class UneatenLeaves {

	public static int findUneatenLeaves(int[] array, int leaves) {
		boolean[] booleanLeaves = new boolean[leaves];
		Arrays.fill(booleanLeaves, false);
		int uneatenCount = 0;
		
		for(int k=0; k<array.length; k++) {
			for(int l=1; l<=leaves; l++) {
				if((array[k]*l)<=leaves) {
					booleanLeaves[(array[k]*l)-1] = true;
				}
			}
		}

		for(int i=0; i<leaves; i++) {
			if(booleanLeaves[i] == false) {
				System.out.println("booleanLeaves["+i+"] : "+booleanLeaves[i]);
				uneatenCount++;
			}				
		}
		return uneatenCount;	
	}

	public static void main(String args[]) {

		int[] array = {2, 4, 5};
		int uneatenLeaves = findUneatenLeaves(array, 1000);
		System.out.println("Number of uneaten leaves : "+ uneatenLeaves);

	}
}