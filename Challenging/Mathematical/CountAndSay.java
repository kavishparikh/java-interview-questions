import java.io.*;
import java.util.*;

public class CountAndSay {

	public static String countAndSay(int num) {
		if(num < 0)
			return null;

		String result = "1";
		int i=1;

		while(i < num) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for(int j=1; j<result.length(); j++) {
				if(result.charAt(j) == result.charAt(j-1)) {
					count++;
				} else {
					sb.append(count);
					sb.append(result.charAt(j-1));
					count =1;
				}
			}
			sb.append(count);
			sb.append(result.charAt(result.length() -1));
			result = sb.toString();
			i++;
		}
		return result;
	}

	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// Scanner in  = new Scanner(System.in);
			System.out.println("Enter a number to find nth count and say element : ");
			int num = Integer.parseInt(br.readLine());
			String nthElement = countAndSay(num);
			System.out.println("The nth Count and Say element : " + nthElement);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}