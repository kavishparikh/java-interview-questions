class Node {
	private int idata;

	public Node(int key) {
		idata = key;
	}

	public int getKey() {
		return idata;
	}

	public void setKey(int id) {
		idata = id;
	}
}

class Heap {
	private Node[] heapArray;
	private int maxSize;
	private int currentSize;

	public Heap(int mx) {
		maxSize = mx;
		currentSize = 0;
		heapArray = new Node[maxSize];
	}
 
	public boolean isEmpty() {
		return (currentSize == 0);
	}

	public boolean insert(int key) {
	if(currentSize == maxSize)
		return false;
	Node newNode = new Node(key);
	heapArray[currentSize] == newNode;
	trickleUp(currentSize++);
	return true;
	}

	public void trickleUp(int index) {
		int parent = (index-1)/2;
		Node bottom = heapArray[index];
		while(index>0 && heapArray[parent] < heapArray[index]) {
			heapArray[index] = heapArray[parent];
			index = parent;
			parent = (parent-1)/2;
		}
		heapArray[index] = bottom;
	}

	public Node remove() {
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		trickleDown(0);
		return root;
	}

	public void trickleDown(int index) {
		int largerChild;
		Node top = heapArray[index];
		while(index < currentSize/2) {
			int leftChild = (2*index)+1;
			int rightChild = (2*index)+2;
			if(rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey())
				largerChild = rightChild;
			else
				largerChild = leftChild;
			if(top.getKey() >= heapArray[largerChild].getKey())
				break;
			heapArray[index] = heapArray[largerChild];
			index = largerChild;
		}
		heapArray[index] = top;
	}

	public boolean change(int index, int newValue) {
		if(index<0 || index>=currentSize)
			return false;
		int oldValue = heapArray[index].getKey();
		heapArray[index].setKey(newValue);
		if(oldValue < newValue)
			trickleUp(index);
		else
			trickleDown(index);
		return true;
	}	

	public void displayHeap() {
		System.out.println("HeapArray : ");
		for(int m=0; m<currentSize; m++) {
			if(heapArray[m] != null)
				System.out.println(heapArray[m].getKey() + " ");
			else
				System.out.println(" Heap is empty");
		}
	}
}


public class HeapTree {
	public static void main(String args[]) {
		int value1, value2;
		Heap theHeap = new Heap(31);
		boolean success;

		theHeap.insert(70);
		theHeap.insert(20);
		theHeap.insert(80);
		theHeap.insert(60);
		theHeap.insert(10);
		theHeap.insert(53);
		theHeap.insert(87);
		theHeap.insert(12);
		theHeap.insert(99);
		theHeap.insert(75);
		theHeap.insert(54);
		theHeap.insert(34);
	}
}
