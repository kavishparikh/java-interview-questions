import java.io.*;
import java.util.*;

public class MiddleElementinLinkedList {

	// We use 2 list pointers, at first both points to the head, then we iterate along the linked list, 
	// increment the length with iteration.
	// if the length is  divisible by 2, move the middle pointer to next/
	// Thus, with this we have have middle element when the first pointer reaches last element.

	public static findMiddleElement(ListNode head) {
		if(head == null)
			return null;

		ListNode current = head;
		ListNode middle = head;
		int length = 0;

		while(current.next != null) {
			length++;
			if(length%2 == 0) 
				middle = middle.next;
			current = current.next;
		}
		if(length%2 == 1)
			middle = middle.next;

		return middle;
	}

	// The second method would be to use a doubly linked list, this way we can move 2 pointer forward and backward at each iterations
	// This method would not be very efficient

	public static void main(String[] args) {
		
	}

}