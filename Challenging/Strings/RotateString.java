import java.io.*;
import java.util.*;

// This solutions uses substring. You can invert the substring from 0 to length-modulo rotation 
// with the substring length-modulo rotation to the end.

public class RotateString {

	public static String rotateString(String str, int rotationValue) {
        int mod = rotationValue % str.length();
        
        System.out.println(str.substring(str.length() - mod, str.length()));
        System.out.println( str.substring(0, str.length() - mod) );
        
        return str.substring(str.length() - mod, str.length()) + str.substring(0, str.length() - mod);
    }

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String name = "hetvi";
			
			System.out.println("Enter a Rotation Value : ");
			int rotationValue = Integer.parseInt(br.readLine());
			
			name = rotateString(name, rotationValue);
			
			System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}

// One other option is storing input in a circular linked list and then moving the 
// head pointer by "rotationValue" places