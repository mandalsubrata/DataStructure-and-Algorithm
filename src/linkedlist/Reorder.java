package linkedlist;

import java.util.Stack;

public class Reorder {

	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(3);
		ListNode D = new ListNode(4);
		ListNode E = new ListNode(5);

		A.next=B;
		B.next=C;
		C.next=D;
		D.next=E;
		System.out.println("LinkedList: "+A);
		System.out.println("LinkedList: "+solve(A));

	}
	private static ListNode solve(ListNode A) {
		if(A == null && A.next.next == null) {
			return null;
		}
		ListNode slow = A;
		ListNode fast = A;
		ListNode prev = A;

		while(fast !=null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = null;
		ListNode l1 = A;
		ListNode l2 = reverse(slow);
		merge(l1,l2);
		return A;
	}
	private static void merge(ListNode l1, ListNode l2) {
		while(l2 != null) {
			ListNode next = l1.next;
			l1.next = l2;
			l1=l2;
			l2=next;
		}

	}
	private static ListNode reverse(ListNode a) {
		ListNode h = a;
		ListNode cur = a;
		ListNode prev = null;
		ListNode next = cur;

		while(cur !=null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;
	}

}
