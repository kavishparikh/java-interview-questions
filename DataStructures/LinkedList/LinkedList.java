import java.io.*;
import java.util.*;

// NOTE :: Reference manipulation is the heart of Link List

// CLASS Link
class Link {
	int idata;
	double ddata;
	Link next;

	public Link(int id, double dd) {
		idata = id;
		ddata = dd;
	}

	public void displayList() {
		System.out.println("{ "+ idata +" , "+ ddata +" }");
	}
}


// Class LinkList
class LinkList {
	Link first;

	public LinkList(){
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	public Link findNode(int key) {
		Link current = first;
		while(current.idata != key) {
			if(current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;
	}

	public link deleteNode(int key) {
		Link current = first;
		Link previous = first;
		while(current.idata != key) {
			if(current.next == null)
				return null;
			else {
				previous = current;
				current = current.next;
			}
		}
		if(current == first)
			first = first.next;
		else
			previous.next = current.next;
		return current;
	}

	public void displayLink() {
		System.out.println("Link (first --> last)");
		Link current = first;
		while(current != null) {
			current.displayList();
			current = current.next;
		}
		System.out.println();
	}
}


// CLASS LinkedList
public class LinkedList {
	public static void main(String args[]) {
		LinkList theList = new LinkList();

		theList.insertFirst(22, 2.99);
		theList.insertFirst(33, 3.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(55, 5.99);
		theList.insertFirst(66, 6.99);

		theList.displayLink();

		Link fin = theList.findNode(44);
		if(fin != null)
			System.out.println("The node found with key "+del.idata);
		else
			System.out.println("Could not find key in list");

		Link del = theList.deleteNode(44);
		if(del != null)
			System.out.println("The node deleted with key "+del.idata);
		else
			System.out.println("Cannot delete, system underflow");

		while(!theList.isEmpty()) {
			theList.deleteFirst();
			System.out.println("Node deleted");
			theList.displayLink();
			System.out.println();
		}
		theList.displayLink();
	}
}