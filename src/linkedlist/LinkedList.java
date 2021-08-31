package linkedlist;

public class LinkedList {

	Node head;
	
	public LinkedList() {
		this.head = null;
	}
	public LinkedList(int value) {
		this.head = new Node(value);
	}

	public void push(int value) {
		Node temp = head;
		while (temp.next != null)
			temp = temp.next;
		temp.next = new Node(value);
	}

	public boolean addAfter(int after, int value) {
		boolean added = false;
		Node temp = head;
		while (temp != null && temp.value != after)
			temp = temp.next;
		if (temp != null) {
			Node newNode = new Node(value);
			newNode.next = temp.next;
			temp.next = newNode;
			added = true;
		}
		return added;
	}

	public boolean delete(int value) {
		boolean deleted = false;
		Node temp = head;
		while (temp != null && temp.next.value != value)
			temp = temp.next;
		if (temp != null) {
			temp.next = temp.next.next;
			deleted = true;
		}
		return deleted;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

}
