package linkedlist;

public class ReverseBtoC {

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
		System.out.println("LinkedList: nth val: "+reverseBetween(A,2,4));

	}

	public static ListNode reverseBetween(ListNode A, int B, int C) {
		ListNode head = A;
		int n =1;
		while(n<B && A!=null){
			A=A.next;
			n++;
		}
		ListNode prev = null;
		ListNode cur = A;
		ListNode next = A;
		ListNode h2 = A;

		while(cur!=null && n<=C){
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur=next;
			n++;
		}
		head.next = prev;       
		return head;
	}
}
