package linkedlist;

public class DeleteElementfromEnd {

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
		System.out.println("LinkedList: : "+removeNthFromEnd(A,2));
	}
	public static ListNode removeNthFromEnd(ListNode A, int B) {
		int n = 0;
		ListNode h = A;
		while(h!=null){
			h=h.next;
			n++;
		}
		if(n==1 || n==0 || B>n) {
			return A;
		}
		ListNode prev = null;
		ListNode cur = A;
		int k = n-B;
		ListNode t = A;
		while(k>1){
			k--;
			t=t.next;
//			prev = cur;
//			cur = cur.next;
			
		}
		t.next = t.next.next;
		//prev.next = cur.next;
		return A;
	}


}
