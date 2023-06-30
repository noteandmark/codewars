package tasks_5_level.task29_swapnodepairs;

public class LinkedListPairs {
	public static Node swapPairs(Node head) {
		
        if (head == null || head.next == null) {
            // If the list is empty or contains only one node, no swapping needed
            return head;
        }
        
        // Create a dummy node to handle the head swapping case
		Node dummy = new Node("");
		dummy.next = head;
		
		// Initialize three pointers: prev, current, and next
		Node prev = dummy;
		Node current = head;
		Node next = head.next;

		while (current != null && next != null) {
			// Swapping adjacent nodes
			current.next = next.next;
			next.next = current;			
			prev.next = next;

			// Move the pointers to the next pair of nodes
			prev = current;
			current = current.next;
            if (current != null) {
                next = current.next;
            }
		}

		return dummy.next;
	}
}
