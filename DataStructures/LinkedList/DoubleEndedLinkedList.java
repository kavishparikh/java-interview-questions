import java.io.*;
import java.util.*;

public class DoubleEndedLinkedList{

	public static void main(String args[]){

	}

}

public class Link{
	public int idata;
	public int ddata;
	public Link next;

	public Link(int id, int dd){
		idata = id;
		ddata = dd;
	}

	public void displayLink(){
		System.out.println("{ "+idata+" , "+ddata+" }");
	}
}

public class LinkedList{
	private Link first;
	private Link last;

	public boolean isEmpty(){
		return (first == null) ;
	}

	public void insertFirst(int id, int dd){
		Link newlink = new Link(id, dd);
		//OR
		//newlink.id = id;
		//newlink.dd = dd;
		if(isEmpty())
			last = newlink;
		newlink.next = first;
		first = newlink;
	}

	public void insertLast(int id, int dd){
		Link newlink = new Link(id, dd);
		//OR
		//newlink.id = id;
		//newlink.dd = dd;
		if(isEmpty())
			first = newlink;
		else
			last.next = newlink;
		last = newlink;
	}

	public Link deleteFirst(){
		Link temp  = first;
		if(first.next == null)
			last = null;
		first = first.next;
		return temp;
	}

	public Link delete(int key){
		Link current = first;
		Link previous = first;
		while(current.idata != key){
			if(current.next == null)
				return null;
			else{
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

	public void displayList(){
		System.out.println("List (first --> last) : ");
		Link current = first;
		while(current != null){
			current.displayLink();
			currnt = current.next;
		}
		System.out.println(" ");
	}

	public Link findLink(int key){
		Link current = first;
		while(current.idata != key){
			if(current.next == null)
				return null;
			else
				current = current.next;
		}
		//Just an extra statement
		// if(current == null)
		// 	return null;
		return current;
	}

}