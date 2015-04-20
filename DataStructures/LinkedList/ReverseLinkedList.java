public static void reverseLinkedList(LinkedList linkedlist) {
	LinkedListNode start  = linkedlist.head;
	LinkedListNode temp = null;

	while(start != null) {
		temp = start.next;
		start.next = start.previous;
		start.previous = temp;

		if(start.previous == null)
			linkedlist.head = start;

		start = linkedlist.previous;
	}
}