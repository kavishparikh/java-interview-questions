public static ListNode mergeSortedLinkedList(ListNdoe l1, ListNode l2) {
	ListNode p1 = l1;
	ListNode p2 = l2;

	ListNode fakeHead = new ListNode(0);
	ListNode p = fakeHead;

	while(p1!=null && p2!= null) {
		if(p1.value < p2.value) {
			p.next = p1.value;
			p1 = p1.next;
		} else {
			p.next = p2.value;
			p2 = p2.next;
		}

		p = p.next;
	}

	if(p1!=null) {
		p.next = p1.value;
		p1 = p1.next;
	}
	if(p2!=null) {
		p.next = p2.value;
		p2 = p2.next;
	}

	return fakeHead.next;
}