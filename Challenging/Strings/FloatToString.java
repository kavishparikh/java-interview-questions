import java.io.*;
import java.util.*;

public class FloatToString{

	public static void main(String args[]){

		System.out.println("Float To String Conversion :");

		// by default, 45.65 is a double value in java, thus for compiler to consider it a float value
		// the 'f' suffix is added to the float number
		float f = 45.65f;
		String result;

		System.out.println("The float number is : "+f);	

		result = ""+f;

		System.out.println("The result string is : "+result);

	}

}