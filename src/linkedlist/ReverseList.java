package linkedlist;

public class ReverseList {

	public static void main(String[] args) {
		ListNode A = new ListNode(6);
		ListNode B = new ListNode(5);
		ListNode C = new ListNode(5);
		ListNode D = new ListNode(3);
		ListNode E = new ListNode(8);
		
		A.next=B;
		B.next=C;
		C.next=D;
		D.next=E;
		System.out.println("LinkedList: "+A);
		System.out.println("LinkedList: "+solve(A));

	}

	private static ListNode solve(ListNode a) {
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
		System.out.println(">>>: "+h);
		return prev;
	}

}
