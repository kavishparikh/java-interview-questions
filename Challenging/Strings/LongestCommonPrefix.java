import java.io.*;
import java.util.*;

// The program is not accurate, needs to be solved. no output

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strs) {
	    if(strs == null || strs.length == 0)
	        return "";
	 
	    int minLen=Integer.MAX_VALUE;
	    
	    for(String str: strs){
	        if(minLen > str.length())
	            minLen = str.length();
	    }
	    if(minLen == 0) return "";
	 
	    for(int j=0; j<minLen; j++){
	        char prev='0';
	        for(int i=0; i<strs.length ;i++){
	            if(i==0) {
	                prev = strs[i].charAt(j);
	                continue;
	            }
	 
	            if(strs[i].charAt(j) != prev){
	                return strs[i].substring(0, j);
	            }
	        }
	    }	 
	    return strs[0].substring(0,minLen);
	}

	public static void main(String[] args) {
		String[] str = {"Hello World People", "ello Wo"}; //, "llo World", "lo World Peop"
		String output = longestCommonPrefix(str);
		System.out.println("Longest common prefix : " + output);
	}
}
