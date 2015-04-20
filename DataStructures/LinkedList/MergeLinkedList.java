public static void mergeLinkedList(listNode head, listNode second) {
	listNode p1 = head;
	listNode p2 = second;

	while(p2 != null) {
		listNode temp1 = p1.next;
		listNode temp2 = p2.next;

		p1.next = p2;
		p2.next = temp1;

		temp1 = p1;
		temp2 = p2;
	}
}