package linkedlist;

public class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null;}
	@Override
	public String toString() {
		//return "ListNode [val=" + val + ", next=" + next + "]";
		return ""+val+"->"+next;
	}
	
}
