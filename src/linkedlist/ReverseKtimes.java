package linkedlist;

public class ReverseKtimes {

	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(3);
		ListNode D = new ListNode(4);
		ListNode E = new ListNode(5);
		ListNode F = new ListNode(6);
		
		A.next=B;
		B.next=C;
		C.next=D;
		D.next=E;
		E.next=F;
		
		System.out.println("LinkedList: nth val: "+reverseList(A,2));


	}
	public static ListNode reverseList(ListNode A, int B) {
		System.out.println("LinkedList: "+A);

        if(A==null){
            return A;
        }

        int n = 0;
        ListNode next = null;
        ListNode cur = A;
        ListNode prev = null;

        while(n<B && cur!=null){
            next = cur.next;
            cur.next = prev;
            prev=cur;
            cur = next;
            n++;
        }
        if(next !=null)
            A.next= reverseList(next,B);
        return prev;
	}
}
