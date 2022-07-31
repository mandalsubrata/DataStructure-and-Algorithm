package linkedlist;

public class FindNthPosElement {

	public static void main(String[] args) {
		ListNode A = new ListNode(46);
		ListNode B = new ListNode(76);
		ListNode C = new ListNode(35);
		
		A.next=B;
		B.next=C;
		System.out.println("LinkedList: "+A);
		System.out.println("LinkedList: nth val: "+solve(A));

	}

	public static int solve(ListNode A) {
		int n = 0;
		ListNode node = A;
		while(A!=null){
			n++;
			A=A.next;
		}
		if(n%2==0){
			n = (n/2)+1;
			n--;
		} else {
			n=n/2;
		}
		
		while(n>0 && node!=null){
			node=node.next;
			n--;
		}
		return node.val;
	}



}
