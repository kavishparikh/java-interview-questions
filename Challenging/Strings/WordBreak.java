import java.io.*;
import java.util.*;

// This is a dynamic programming solution, we remember the intermediate values in the tracker array

// The time complexity is O(length of string * size of set)

// Here the good thing is that, if a match is found in dict, it will continue; the internediate loops
// until it reaches the next unrecodnized tracker location/index 

public class WordBreak {

	public static boolean wordBreak(String str, Set<String> dict) {

		boolean[] tracker = new boolean[str.length()+1];
		tracker[0] = true;

		for(int i=0; i<str.length(); i++) {
			if(!tracker[i])
				continue;
			for(String a : dict) {
				int len = a.length();
				int end = i + len;
				if(end > str.length())
					continue;
				if(tracker[end])
					continue;
				if(str.substring(i, end).equals(a))
					tracker[end] = true;
			}
		}

		return tracker[str.length()];

	}

	public static void main(String[] args) {
		String str = "leetcode";
		Set<String> dict = new HashSet<String>();

		dict.add("hello");
		dict.add("bye");
		dict.add("leet");
		dict.add("go");
		dict.add("ssup");
		dict.add("code");
		dict.add("hi");
		
		boolean result = wordBreak(str, dict);
		System.out.println(result);
	}

}