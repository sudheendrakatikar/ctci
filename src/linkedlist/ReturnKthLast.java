package linkedlist;

public class ReturnKthLast {

	// 2.2 - Return the Kth last element in a linked list
	public static Node kthLast(Node head, int k) {
		Node runner = head;
		while (k > 0 && runner != null) {
			runner = runner.next;
			k--;
		}
		while (runner != null) {
			head = head.next;
			runner = runner.next;
		}
		return head;
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList(0);
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		System.out.println(kthLast(list.head, 7).value);
	}

}
