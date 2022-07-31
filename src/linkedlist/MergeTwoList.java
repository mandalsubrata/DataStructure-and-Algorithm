package linkedlist;

public class MergeTwoList {

	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(3);
		ListNode D = new ListNode(4);
		ListNode E = new ListNode(5);
		ListNode F = new ListNode(6);

		A.next=B;
		B.next=C;
		D.next=E;
		E.next=F;
		System.out.println("LinkedList 1: "+A);
		System.out.println("LinkedList 2: "+D);
		System.out.println("LinkedList: "+merge(A,D));

	}

	private static ListNode merge(ListNode a, ListNode b) {
		ListNode head = a;
		while(a!=null && b!=null) {
			ListNode next = a.next;
			a.next = b;
			a=b;
			b=next;
		}
		return head;
	}

}
