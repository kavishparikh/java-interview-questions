import java.io.*;
import java.util.*;

public class RedirectingPipingInput {

	public static void main(String args[]) {

		System.out.println(">>> Understanding System.out.format(); ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			System.out.println("Please enter a number :");
			
		} catch(Exception e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}

	}

}