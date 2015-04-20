import java.io.*;
import java.util.*;

public class CaseCombinations {

	// Iterative Approach
	public static Set<String> combinations(String s) {
		Set<String> combs = new HashSet<String>();
		
		if(s==null || s.length()==0) {
			return combs;
		}
		
		combs.add(s);
		
		for(int i=0; i<s.length();i++) {
			Set<String> newcombs = new HashSet<String>();
			for(String comb: combs) {
				if(Character.isLowerCase(comb.charAt(i))) {
					newcombs.add(comb.substring(0,i) + Character.toUpperCase(comb.charAt(i)) + comb.substring(i+1));
				}
			}
			combs.addAll(newcombs);
		}
		
		return combs;
	}

	// Recursive Approach
	public static List<String> recursiveCombinations(String s, int pos) {
		List<String> combs = new ArrayList<String>();
		if(s==null || s.length()==0) {
			return combs;
		}
		if(pos>=s.length()) {
			combs.add("");
			return combs;
		}
		for(String srec: allCombsRec(s,pos+1)) {
			if(Character.isLowerCase(s.charAt(pos))) {
				combs.add(Character.toUpperCase(s.charAt(pos))+srec);
			}
			combs.add(s.charAt(pos)+srec);
		}
		return combs;
	}


	public static void main(String[] args) {
		String str = "0ab";
		Set<String> output = combinations(str);
		System.out.println(output);
	}

}



