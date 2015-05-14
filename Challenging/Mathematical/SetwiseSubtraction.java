import java.io.*;
import java.util.*;

// Question : Implement a function that takes the set-wise subtraction of   
// 			  two sorted sets of integers. 
// 			  ie A = {1, 2, 3}, B = {3, 4, 5} => A - B = {1, 2}. 
// 			  There can be duplicates, in which case all duplicates should 
// 			  be removed should there be an occurrence in B. IE: {1, 2, 3, 3, 3} - {2, 3} = {1}.

public class SetwiseSubtraction {

	public static int[] subtract(final int[] array1, final int[] array2) {
        List<Integer> result = new ArrayList<>();
        for (int i : array1) {
        	// NOTE: For Arrays.binarySearch(int[], key) to work, the source array must be sorted before
            int pos = Arrays.binarySearch(array2, i);
            if (pos < 0) {
                result.add(i);
            }
        }

        int[] res = new int[result.size()];
        for(int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }
        return res;
    }

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 3};
		int[] b = { 2, 3};
		int[] result = subtract(a, b);
		for (int i: result)
			System.out.println(i + " "); 
		System.out.println();
	}

}