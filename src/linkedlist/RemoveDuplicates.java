package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	// 2.1 - Remove duplicated from an unsorted linked list
	public static void removeDups(Node head) {
		Set<Integer> set = new HashSet<Integer>();
		Node prev = null;
		while (head != null) {
			if (set.contains(head.value)) {
				prev.next = head.next;
			} else {
				set.add(head.value);
				prev = head;
			}
			head = head.next;
		}
	}

	// Follow up - Can't use a temporary buffer
	public static void removeDupsNoSpace(Node head) {
		while (head.next != null) {
			Node runner = head.next;
			Node prev = head;
			while (runner != null) {
				if (runner.value == head.value) {
					prev.next = runner.next;
				} else {
					prev = runner;
				}
				runner = runner.next;
			}
			head = head.next;
		}
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList(0);
		list.push(1);
		list.push(0);
		list.push(1);
		list.push(2);
		list.push(4);
		list.push(3);
		list.push(4);
		list.push(2);
		removeDupsNoSpace(list.head);
		list.print();
	}

}
