import java.io.*;
import java.util.*;

public class DataStructurizeDataSet {


	public static void dataStructurizeUsingArrayList(ArrayList dataset) {
		Collections.sort(dataset);
		System.out.println("Printing sorted dataset : " + dataset);
		// displaying sequentially
		for(int i=0; i<dataset.size(); i++)
			System.out.println(dataset.get(i));
	}

	public static void printMap(HashMap dataset) {
		// following iterates over each entry in the hashmap
		for(Map.Entry<Integer, String> entry : dataset.entrySet()) 	
			System.out.println(entry.getKey() + " : " + entry.getValue());
	}
	
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\Coding Practise\\Java\\Yelp Challenge\\Dataset.txt"));
			String data = br.readLine();
			int id =0;
			
			//ArrayList dataset = new ArrayList();
			// while(data != null) {
			// 	dataset.add(data);
			// 	data = br.readLine();
			// }
			// dataStructurizeUsingArrayList(dataset);

			HashMap dataset = new HashMap();
			while(data != null) {
				dataset.put(++id, data);
				data = br.readLine();
			}
			printMap(dataset);

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

} 