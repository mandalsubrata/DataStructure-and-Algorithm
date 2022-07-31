package linkedlist;

public class DeleteFromMiddle {

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
		System.out.println("LinkedList: nth val: "+solve(A));

	}
	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 *     public int val;
	 *     public ListNode next;
	 *     ListNode(int x) { val = x; next = null; }
	 * }
	 */
	public static  ListNode solve(ListNode A) {
		
        int n = 0;
        ListNode t =A;

        while(t!=null){
            t = t.next;
            n++;
        }
        if(n%2==0){
            n = (n/2)-1;
        } else {
            n=(n/2)-1;
        }
        int m = n;
        ListNode ans = A;
        ListNode temp = A;
        
        while(A!=null && n>0){
            A=A.next;
            n--;
        }
        ListNode node = A.next;
        node = node.next;
        A.next=node;

        while(m>0 && temp!=null){
            temp=temp.next;
            m--;
        }
        //temp = A;
        ans.next = A;

        return ans;
        
//		int n = 0;
//		ListNode t =A;
//		while(t!=null){
//			t = t.next;
//			n++;
//		}
//		if(n%2==0){
//			n = (n/2);
//		} else {
//			n=(n/2)-1;
//		}
//        ListNode ans = A;
//		while(A!=null && n>0){
//			A=A.next;
//			n--;
//		}
//		ListNode node = A.next;
//		node = node.next;
//		A.next=node;
//		ans.next=A;
//		return ans;
	}
}
