import java.io.*;
import java.util.*;

public class LongestSubstringWithoutRepeating {

	public static int lengthOfLongestSubstring(String str) {
		char[] ch = str.toCharArray();
		int length = 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for(int i=0; i<ch.length; i++) {
			if(!map.containsKey(ch[i])) {
				map.put(ch[i], i);
			} else {
				length = Math.max(length, map.size());
				i = map.get(ch[i]);
				map.clear();
			}
		}
		return Math.max(length, map.size());
 	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a string of your choice ?");
			String str = br.readLine();
			System.out.println("The number of characters for longest substring without repeating : " + lengthOfLongestSubstring(str));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}