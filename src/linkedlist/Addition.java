package linkedlist;

public class Addition {

	public static LinkedList add(Node l1, Node l2) {
		LinkedList sum = new LinkedList();
		int carry = 0;
		int total = 0;
		while (l1 != null && l2 != null) {
			total = carry + l1.value + l2.value;
			carry = total / 10;
			total = total % 10;
			if (sum.head == null)
				sum.head = new Node(total);
			else
				sum.push(total);
			l1 = l1.next;
			l2 = l2.next;
		}
		Node r;
		if (l1 != null) r = l1;
		else r = l2;
		while (r != null) {
			total = carry + r.value;
			carry = total / 10;
			total = total % 10;
			sum.push(total);
			r = r.next;
		}
		if (carry > 0)
			sum.push(carry);

		return sum;
	}

	public static void main(String[] args) {

		LinkedList list1 = new LinkedList(7);
		list1.push(1);
		list1.push(6);
		LinkedList list2 = new LinkedList(5);
		list2.push(9);
		list2.push(2);
		list2.push(8);

		LinkedList sum = add(list1.head, list2.head);
		sum.print();

	}

}
