public static LinkedListNode addTwoNumbers(LinkedListNode l2, LinkedListNode l2) {
	LinkedListNode newnode = new LinkedListNode(0);

	LinkedListNode p1 = l1;
	LinkedListNode p2 = l2;
	LinkedListNode p3 = null;

	int carry = 0;

	// solves issues for variable linked list lengths
	while(p1 != null || p2 != null) {
		if(p1 != null) {
			carry += p1.val;
			p1 = p1.next;
		}
		if(p2 != null) {
			carry += p2.val;
			p2 = p2.next
		}

		p3.next = new LinkedListNode(carry%10);
		p3 = p3.next;
		carry /= 10;
	}

	if(carry = 1)
		p3.next = new LinkedListNode(1);

	return newnode.next;
}