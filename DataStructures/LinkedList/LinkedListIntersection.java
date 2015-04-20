public statc ListNode findIntersection(ListNode head1, ListNode head2) {

	if(head1 == null || head2 == null) {
		return null;
	}

	ListNode p1 = head1;
	ListNode p2 = head2;

	int len1 = 0;
	int len2 = 0;

	while(p1 != null) {
		len1++;
		p1 = p1.next;
	}
	while(p2 != null) {
		len2++;
		p2 = p2.next;
	}

	int diff = 0;
	p1 = head1;
	p2 = head2;

	if(len1 > len2) {
		diff = len1 - len2;
		int i=0;
		while(i < diff) {
			i++;
			p1 = p1.next;
		}
	} else {
		diff = len2 - len1;
		int i=0;
		while(i < diff) {
			i++;
			p2 = p2.next;
		}
	}

	while(p1 != null && p2 != null) {
		if(p1.value == p2.value) {
			return p1;
		} else {
			p1 = p1.next;
			p2 = p2.next;
		}
	}
	return null;	
}