package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class ListIntersection {

	public static Node intersect(Node l1, Node l2) {
		Set<Node> set = new HashSet<Node>();
		while (l1 != null && l2 != null) {
			if (set.contains(l1))
				return l1;
			if (set.contains(l2))
				return l2;
			set.add(l1);
			set.add(l2);
			l1 = l1.next;
			l2 = l2.next;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList(0);
		l1.push(1);
		l1.push(2);
		l1.push(3);
		l1.push(4);
		
		LinkedList l2 = new LinkedList(1);
		l2.push(3);
		// This will point 1 to 2 from the other list
		l2.head.next = l1.head.next.next;
		
		try {
			System.out.println(intersect(l1.head, l2.head).value);
		}
		catch (NullPointerException e) {
			System.out.println("No Intersect");
		}
	}

}
