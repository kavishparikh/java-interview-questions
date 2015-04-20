import java.io.*;
import java.util.*;

public class SimpleMethodCall{

	public static void main(String args[]){

		try{

			System.out.println("Hi..welcome to final java prep.");

			int k = add(4, 5);

			System.out.println("Sum of 4 and 5 is :"+k);
			System.out.println("If this message is displayed..all is ok.");	
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Inside Exception");
		}
		

	}

	public static  int add(int i, int j){

		int sum = i+j;
		return sum;
	}
}