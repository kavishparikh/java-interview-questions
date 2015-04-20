import java.io.*;
import java.util.*;
import java.net.*;

public class Anagrams{

	public static void main(String args[]){

		try{
			//URL url = new URL("http://www.andrew.cmu.edu/course/15-121/dictionary.txt");
			
			BufferedReader br = new BufferedReader(new FileReader("D:\\Coding Practise\\Java\\Challenging\\anagram.txt"));
			
			//BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			//Scanner sc = new Scanner(url.openStream());

			//Creating hashtable for example
			//Hashtable table = new Hashtable();

			HashMap<String, ArrayList<String>> hmap = new HashMap<String, ArrayList<String>>();
			String str;
			while((str = br.readLine()) != null){

			//while(br.hasNextLine()){	

				//String str = br.readLine();
				System.out.println("The current word is : "+str);
				String sortedstr = sortedWord(str);
				System.out.println("The sorted word is : "+sortedstr);

				ArrayList<String> anagrams = hmap.get(sortedstr);
				if(anagrams == null){
					anagrams = new ArrayList<String>();
				}

				anagrams.add(str);
				hmap.put(sortedstr, anagrams);
				System.out.println(hmap);
			}	

			//System.out.println(hmap.get(sortedWord("nard")));

		}catch(Exception e){
			System.out.println("Exception Caught");
			e.printStackTrace();
		}finally{
			System.out.println("Exiting");
			System.exit(1);
		}

	}

	public static String sortedWord(String str){
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}

}