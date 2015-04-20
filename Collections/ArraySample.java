import java.io.*;
import java.util.*;

public class ArraySample{

	public static void main(String[] args) {

		try{

			int[] arr = new int[10];

			for(int i=0; i<arr.length; i++){
				arr[i] = i;	
				//System.out.println(i);
			}
				
			for(int x : arr)
				System.out.println(x);

			//Shifting array element in case of deletion
			// k is the index position to be deleted
			for(int i=k; i< arr.length; i++)
				arr[i] = arr[i+1];

			//Displaying date
			Date date = new Date();
			System.out.println("Current date : "+date);
			Thread.sleep(3000);
			date = new Date();
			System.out.println("Current date : "+date);	
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Inside exception");
		}

	}
	
}