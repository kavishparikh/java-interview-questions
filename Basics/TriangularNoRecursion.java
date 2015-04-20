import java.io.*;
import java.util.*;

public class TriangularNoRecursion{

	public static void main(String args[]) {
		
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Calculate Triangular Number for : ");
			int n = Integer.parseInt(br.readLine());
			int ans = calculateTriangularNo(n);
			System.out.println("The answer is : "+ans);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static int calculateTriangularNo(int n){
		// NOTE : In general triangular number = (n2+n)/2
		if(n == 1)
			return 1;
		else
			return n + calculateTriangularNo(n-1);
	}
}