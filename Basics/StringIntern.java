import java.io.*;
import java.util.*;

public class StringIntern{
	public static void main(String args[]){
		System.out.println(">>> String Interning");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{
			String s1 = "Hello";
			String s2 = "Hello";
			String s3 = new String("Hello");

			System.out.println("Before String Intern");
			System.out.println("s1 == s2 : "+(s1==s2)); //true
			System.out.println("s1 == s3 : "+(s1==s3)); //false
			System.out.println("s2 == s3 : "+(s2==s3)); //false

			// The string intern is applied to string not initialized using new operator
			System.out.println("After String Intern");
			s3 = s1.intern();
			System.out.println("s1 == s2 : "+(s1==s2));
			s3 = s2.intern();
			System.out.println("s1 == s3 : "+(s1==s3));
			System.out.println("s2 == s3 : "+(s2==s3));

		}catch(Exception e){
			System.out.println("Exception caught");
			e.printStackTrace();
		}
	}
}