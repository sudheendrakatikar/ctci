package linkedlist;

public class Palindrome {
	
	public static Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	public static boolean isPalindrome(Node head) {
		Node reversed = reverse(head);
		while (head != null && reversed != null) {
			if (head.value != reversed.value) {
				return false;
			}
			head = head.next;
			reversed = reversed.next;
		}
		return (head == null && reversed == null);
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList(0);
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(2);
		list.push(1);
		list.push(0);
		System.out.println(isPalindrome(list.head));
	}

}
