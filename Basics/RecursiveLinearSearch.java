import java.io.*;
import java.util.*;

public class RecursiveLinearSearch {

	public static void main(String args[]) {

		//Scanner in = new Scanner(System.in);

		int[] arr = {45, 43, 765, 42, 876, 32, 12, 5, 7, 7457};

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the key to search ?");
			int key = Integer.parseInt(br.readLine());
			int len = arr.length;
			//int key = in.nextInt();
			int position = searchElement(key, len, arr);
			if(position == -1)
				System.out.println("Number not found.");
			else
				System.out.println("Number found at position "+position);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static int searchElement(int key, int len, int[] arr) {
		if(len < 1)
			return -1;
		if(arr[len-1] == key)
			return (len);
		return searchElement(key, len-1, arr);
	}
}