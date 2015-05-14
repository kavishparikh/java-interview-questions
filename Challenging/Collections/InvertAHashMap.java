import java.io.*;
import java.util.*;

// Invert a Map -> e.g 1: {a,b} 2: {c,d} becomes a:1 b:1 c:2 d2  

public class InvertAHashMap {

	private static HashMap<Character, Integer> invertHashMap(HashMap<Integer, ArrayList<Character>> map) {
		HashMap<Character, Integer> invertMap = new HashMap<Character, Integer>();
		for (Map.Entry<Integer, ArrayList<Character>> entry: map.entrySet()) {
			Integer key = entry.getKey();
			ArrayList<Character> value = entry.getValue();
			for (Character ch: value) {
				invertMap.put(ch, key);	
			}			
		}
		return invertMap;
	}

	public static void main(String[] args) {
		
		HashMap<Integer, ArrayList<Character>> charhmap = new HashMap<Integer, ArrayList<Character>>();
		
		ArrayList<Character> charList1 = new ArrayList<Character>();
		charList1.add('a');
		charList1.add('b');
		charhmap.put(1, charList1);
		ArrayList<Character> charList2 = new ArrayList<Character>();
		charList2.add('c');
		charList2.add('d');
		charhmap.put(2, charList2);
		System.out.println(charhmap);

		HashMap<Character, Integer> invertedCharMap = invertHashMap(charhmap);
		System.out.println(invertedCharMap);

	}

}