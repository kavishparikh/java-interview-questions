import java.util.*; 

public class Caterpiller { 


	//{2,4,5} 
	//N= 10 
	//uneaten leaves= 1,3,7,9 

	public static void findUneatenLeaves(int [] array, int n) 
	{ 
		ArrayList<Integer> uneatenLeaves = new ArrayList<Integer>(); 
		ArrayList<Integer> eatenLeaves = new ArrayList<Integer>(); 

		for (int i=1; i<=n; i++) 
		{ 
			uneatenLeaves.add(i); 
		} 

		System.out.println("Uneaten leaves : " + uneatenLeaves.size());
		//1. find the multiple of the eatenLeaves	
		for (int i=0; i<array.length; i++)  // array.lrngth = 3
		{	
			eatenLeaves.add(array[i]); 
			for (int j=1; j<uneatenLeaves.size(); j++) 
			{ 
				if (array[i]*uneatenLeaves.get(j) <=n) 
				{ 
					eatenLeaves.add(array[i]*uneatenLeaves.get(j)); 
				} 
			} 
		} 

	//	System.out.println(eatenLeaves); 

		//2. determine the uneaten leaves based on the jump and N 
		for (int i=0; i<eatenLeaves.size(); i++) 
		{ 
			for (int j=1; j<uneatenLeaves.size(); j++) 
			{ 
				if(eatenLeaves.get(i) == uneatenLeaves.get(j)) 
				{ 
					uneatenLeaves.remove(uneatenLeaves.get(j)); 
				} 
			} 
		} 

		System.out.println(uneatenLeaves.size()); 

	} 


	public static void main (String [] args) 
	{ 
		int [] array = {3, 5}; 
		findUneatenLeaves(array, 20); 
	} 
}