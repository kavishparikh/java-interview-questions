import java.io.*;
import java.util.*;

class DArray {
	private long[] theArray;
	private int nElems;

	public DArray(int arraySize) {
		theArray = new long[arraySize];
		nElems = 0;
	}

	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}

	public void display() {
		for(int j=0; j<nElems; j++)
			System.out.print(theArray[j] + " ");
		System.out.println();
	}

	public void mergeSort() {
		long[] workspace = new long[nElems];
		recursiceMergeSort(workspace, 0, nElems-1);
	}

	private void recursiceMergeSort(long[] workspace, int lowerBound, int upperBound) {
		if(lowerBound == upperBound)
			return;
		else {
			int mid = (lowerBound + upperBound)/2;
			recursiceMergeSort(workspace, lowerBound, mid);
			recursiceMergeSort(workspace, mid+1, upperBound);
			merge(workspace, lowerBound, mid+1, upperBound);
		}
	}

	private void merge(long[] workspace, int lowPtr, int highPtr, int upperBound) {
		int j=0;
		int lowerBound = lowPtr;
		int mid = highPtr -1;
		int n = upperBound - lowerBound + 1;

		while(lowPtr <= mid && highPtr <= upperBound) {
			if(theArray[j] < theArray[lowPtr])
				workspace[j++] = theArray[lowPtr++];
			else
				workspace[j++] = theArray[highPtr++];
		}

		while(lowPtr <= mid)
			workspace[j++] = theArray[lowPtr++];

		while(highPtr <= upperBound)
			workspace[j++] = theArray[highPtr++];

		for(j=0; j<n ; j++) {
			theArray[lowerBound + j] = workspace[j];
		}
	}
}

public class MergeSortRecursive {
	public static void main(String args[]) {
		int maxSize = 100;
		DArray dar = new DArray(maxSize);

		dar.insert(45);
		dar.insert(32);
		dar.insert(23);
		dar.insert(76);
		dar.insert(74);
		dar.insert(32);
		dar.insert(89);
		dar.insert(96);
		dar.insert(54);

		dar.display();

		dar.mergeSort();
		dar.display();
	}
}