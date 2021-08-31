package linkedlist;

public class RemoveFromMiddle {

	// 2.3 - Delete a node from the middle of a linked list, access given only to
	// that Node (not head)
	public static void removeFromMiddle(Node remove) {
		Node runner = remove.next;
		while (runner != null) {
			remove.value = runner.value;
			if (runner.next == null) {
				remove.next = null;
			}
			remove = remove.next;
			runner = runner.next;
		}
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList(0);
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		removeFromMiddle(list.head.next.next);
		list.print();
	}

}
