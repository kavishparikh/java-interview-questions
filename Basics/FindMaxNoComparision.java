import java.io.*;
import java.util.*;

public class FindMaxNoComparision{

	public static void main(String args[]){

		int max = findMax(50, 30);
		System.out.println("The max number is : "+max);

	}

	public static int findMax(int x, int y){

		int z = x - y;
   		int i  = (z  >>  31)  &  0x1;
   		int  max  =  x - i  *  z;
   		return max;

	}

}