package linkedlist;

public class RemoveDupFromList {

	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(2);
		ListNode D = new ListNode(3);
		ListNode E = new ListNode(3);
		
		A.next=B;
		B.next=C;
		C.next=D;
		D.next=E;
		System.out.println("LinkedList: "+A);
		System.out.println("LinkedList: nth val: "+deleteDuplicates(A));
	}

	public static ListNode deleteDuplicates(ListNode A) {
		ListNode cur = A;
		while(cur!=null){
			ListNode t = cur;
			while(t!=null && t.val ==cur.val) {
				t=t.next;
			}
			cur.next = t;
			cur=cur.next;
		}
		return A;
	}
}
