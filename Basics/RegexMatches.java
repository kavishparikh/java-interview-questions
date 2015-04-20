//package basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
	
	private static String REGEX = "dog";
	private static String INPUT = "The dog says meow." + "All dog says moew.";
	private static String REPLACE = "cat";
	
	public static void main(String args[]){
		
		System.out.println(INPUT);
		
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);	
		
		INPUT = m.replaceAll(REPLACE);
		System.out.println(INPUT);
	}

}
