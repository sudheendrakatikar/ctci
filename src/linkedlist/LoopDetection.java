package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LoopDetection {
	
	// 2.8 - Check if a linked list has a loop, if yes return the start of the loop
	public static Node hasLoop(Node head) {
		Set<Node> set = new HashSet<Node>();
		while (head != null) {
			if (set.contains(head))
				return head;
			set.add(head);
			head = head.next;
		}
		return null;
	}
	
	public static Node hasLoopNoSpace(Node head) {
		Node runner = head.next.next;
		while (runner.next != null) {
			if (head == runner)
				return head;
			head = head.next;
			runner = runner.next.next;
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList(0);
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(1);
		// This creates the loop from 4 -> 2
		list.head.next.next.next.next = list.head.next.next;
		try {
			System.out.println(hasLoopNoSpace(list.head).value);
		}
		catch (NullPointerException e) {
			System.out.println("No Loop");
		}
		
	}

}
