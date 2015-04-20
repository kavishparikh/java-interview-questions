//package DataStructures;

public class GenericMethodTest {
	
	//generic method printArray
	public static <E> void printArray(E[] inputArray){
		//Display array elements
		for(E elements : inputArray){
			System.out.printf("%s ", elements);
		}
		System.out.println();
		
	}
	
	public static void main(String args[]){
		
		//Create arrays of integer, doubles and charachters
		Integer[] intArray = {1, 2, 4, 6, 7};
		Double[] doubleArray = {1.2, 4.5, 435.5, 4.1, 56.5};
		Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
		
		System.out.println("Array intArray contains : ");
		printArray(intArray);
		System.out.println("Array doubleArray contains : ");
		printArray(doubleArray);
		System.out.println("Array charArray contains : ");
		printArray(charArray);
	}

}
