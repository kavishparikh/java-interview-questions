
// When trying to solve multi-level linked list, use following link node structure

// the list node will have 2 refernces, 1 for next and 1 for linked list
class ListNode {
    int label;
    ListNode child;
    ListNode next;
    public ListNode(int l) {
        label = l;
    }
}


// method to solve the linked list

public ListNode flattenList(ListNode head) {
    
    if (head == null)
        return null;
    
    ListNode current = head;
    ListNode tail = head;
    
    // find the tail of the list
    while(tail.next != null) {
        tail = tail.next;
    }
    
    while(current != null) {
        if (current.child != null) {
            tail.next = current.child;
            // move tail to the end tail
            while(tail.next != null)
                tail = tail.next;
            current.child = null;
        }
        current = current.next;
    }
    
    return head;
}

