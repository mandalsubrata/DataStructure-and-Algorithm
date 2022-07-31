package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveLoopFromLinkedList {

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
		System.out.println("LinkedList: nth val: "+solve(A));

	}
    public static ListNode solve(ListNode A) {
        ListNode h = A;
        Set<ListNode> set = new HashSet<>();
        while(h!=null){
            if(!set.add(h.next)){
                h.next=null;
            }
            h=h.next;
        }
        return A;
    }

}
