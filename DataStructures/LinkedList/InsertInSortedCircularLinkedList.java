Node insert(Node n, Node head) {
	Node cur = head;		
	while (cur.next != head) {
		if (cur.value < n.value && cur.next.value >= n.value) {
			Node next = cur.next;
			cur.next = n;
			n.next = next;
			return head;
		}
	}
	if (n.value > cur.value) {
		cur.next = n;
		n.next = head;
		return head;
	}
	if (n.value <= head.value) {
		cur.next = n;
		n.next = head;
		return n;
	}
}