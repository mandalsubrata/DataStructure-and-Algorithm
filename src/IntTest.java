import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IntTest {

	public static void main(String[] args) {
		int n = 121;
		String s = "IVV";
		System.out.println(""+n+" is palindrom "+isPalindrom(n));
		System.out.println("Roman to Int= "+romanToInt(s));
		System.out.println("longestCommonPrefix: "+longestCommonPrefix(new String[]
				{"cir","car"}));
		System.out.println("isValid: "+isValid("{]}[]()"));
		System.out.println("recursion= "+f(5));
		System.out.println("toSum: "+Arrays.toString(twoSum(new int[] {3,2,4}, 6)));
	}

	public static int f(int n) {
		if(n<=1)
			return 1;
		return f(n-1) + f(n-2);
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length;i++) {
			map.put(nums[i], i);
		}
		for(int i=0;i<nums.length;i++) {
			int val = target - nums[i];
			if(map.containsKey(val) && map.get(val)!= i) {
				return new int[] {i,map.get(val)};
			}
		}
		return null;
	}
	public static boolean isPalindrom(int x) {
		int reverse=0, original=x;

		while(x > 0) {
			reverse = reverse * 10 + x%10;
			System.out.println("reverse= "+reverse);
			x= x/10;
			System.out.println("x= "+x);
		}
		return original == reverse;
	}

	public static int romanToInt(String s) {
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result =map.get(s.charAt(s.length()-1));
		for(int i=s.length()-2;i>=0;i--) {
			if(map.get(s.charAt(i))< map.get(s.charAt(i+1)) ) {
				result -= map.get(s.charAt(i));
			}else {
				result += map.get(s.charAt(i));
			}
		}
		return result;
	}
	public static String longestCommonPrefix(String[] strs) {

		boolean stop= false;
		int len = strs.length;
		if(len == 1) {
			return strs[0];
		} 
		if(len == 0) {
			return "";
		}
		String s = "";

		for(int start=0; start<strs[0].length();start++) {
			char ch = strs[0].charAt(start);
			int count = 0;
			for(int i=1;i<len;i++) {
				if(start<= strs[i].length()-1 ){
					if(strs[i].charAt(start)==ch ) {
						count++;
					}else {
						stop = true;
						break;
					}
				}
				if(stop)
					break;
				if(count+1 == strs.length ) {
					s= s+ch;
				}
			}
		}

		return s;
	}
	public static boolean isValid(String s) {
		s= "(])";
		Stack<Character> stack = new Stack<Character>();

		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='(' || s.charAt(i)== '{' || s.charAt(i)== '[') {
				stack.push(s.charAt(i));
			} else {
				if(stack.isEmpty()) {
					return false;
				}
				char pop = stack.peek();
				if((s.charAt(i) == ')' && '(' == pop)
						|| s.charAt(i) == '}' && '{' == pop
						|| s.charAt(i) == ']' && '[' == pop) {
					stack.pop();
				}else {
					return false;
				}
			}

		}
		return stack.isEmpty();

	}


	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode current = new ListNode(0);
		while(list1!= null && list2!= null) {
			if(list1.val <= list2.val) {
				current.next = list1;
				list1=list1.next;
			}else {
				current.next = list2;
				list2 = list2.next;
			}	
			current=current.next;
		}
		current.next= list1!=null?list1:list2;
		return current.next;

	}

}
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



