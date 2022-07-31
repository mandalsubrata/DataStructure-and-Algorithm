package linkedlist;

public class MergeTwoSortedLinkedList {

	
	public static void main(String[] args) {
		ListNode A = new ListNode(5);
		ListNode B = new ListNode(8);
		ListNode C = new ListNode(20);
		
		ListNode D = new ListNode(4);
		ListNode E = new ListNode(11);
		ListNode F = new ListNode(12);

		A.next=B;
		B.next=C;
		D.next=E;
		E.next=F;
		System.out.println("LinkedList 1: "+A);
		System.out.println("LinkedList 2: "+D);
		System.out.println("MergeTwoSortedLinkedList: "+mergeTwoLists(A, D));

	}
	    public static ListNode mergeTwoLists(ListNode A, ListNode B) {
	        ListNode head = null;
	        System.out.println("A="+A.val+" B="+B.val);
	        if(A.val > B.val){
	            head = B;
	            B=B.next;
	        } else {
	            head = A;
	            A=A.next;
	        }
	        ListNode temp = head;
	        while(A!=null && B!=null){
	        	System.out.println("A="+A.val+" B="+B.val);
	        	System.out.println("temp="+temp);
	            if(A.val < B.val){
	                temp.next = A;
	                A=A.next;
	            } else {
	                temp.next = B;
	                B=B.next;
	            }
	            temp=temp.next;
	        }
	        if(A!=null){
	            temp.next = A;
	        }
	        if(B!=null){
	            temp.next = B;
	        }
	        return head;
	    }
}
