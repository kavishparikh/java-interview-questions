import java.io.*;
import java.util.*;

public class RedirectingPipingOutput {

	public static void main(String args[]) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			for(int i=1; i<=100; i++) {
				System.out.println(1);
			}

		} catch(Exception e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}

	}

}