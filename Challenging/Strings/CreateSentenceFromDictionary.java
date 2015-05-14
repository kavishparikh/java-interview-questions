import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class CreateSentenceFromDictionary {
	
	public static void main(String[] args) {
		
		CreateSentenceFromDictionary instance = new CreateSentenceFromDictionary();
		Set<String> dictionary = new HashSet();
		dictionary.add("google");
		dictionary.add("is");
		dictionary.add("awesome");
		List<String> store = new ArrayList<String>();
		instance.printWords("isgoogleawesome", store, dictionary);
		for(int i = store.size() - 1; i >= 0; --i) {
			System.out.println(store.get(i));
		}
	}


	private boolean printWords(String string, List<String> store, Set<String> dictionary) {
		if(string.length() == 0) {
			return true;
		}
		for(int i = 1; i <= string.length(); ++i) {
			String curWord = string.substring(0, i);
			if(dictionary.contains(curWord) && printWords(string.substring(i), store, dictionary)) {
				store.add(curWord);
				return true;
			}
		}
		return false;
	}
}