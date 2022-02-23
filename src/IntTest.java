import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class IntTest {

	public static void main(String[] args) {
		int n = 121;
		String s = "IVV";
		System.out.println(""+n+" is palindrom "+isPalindrom(n));
		System.out.println("Roman to Int= "+romanToInt(s));
		System.out.println("longestCommonPrefix: "+longestCommonPrefix(new String[]
				{"cir","car"}));
		System.out.println("isValid: "+isValid("{[]}[]()"));
		System.out.println("recursion= "+f(5));
		System.out.println("toSum: "+Arrays.toString(twoSum(new int[] {3,2,4}, 6)));
		System.out.println("Nums: "+removeDuplicates(new int[] {}));
		System.out.println("removeElement: "+removeElement(new int[] {},8));
		System.out.println("maxSubArray: "+maxSubArray(new int[] {}));
		System.out.println("searchInsert: "+searchInsert(new int[] {},8));
		System.out.println("search: "+search(new int[] {},8));
		System.out.println("strStr= "+strStr("",""));
		System.out.println("plusOne: "+Arrays.toString(plusOne(new int[] {})));
		addBinary("11","1");
		System.out.println(">>>>>>ff "+ff(8));
//		int[] A = new int[] {1,2,3,2,1};
		ArrayList<Integer> A = new ArrayList<Integer>();
				//Arrays.asList(1,2,3,2,1);
		A.add(1);
	//	A.add(2);
	//	A.add(3);
	//	A.add(2);
		A.add(1);
		A.add(1);
		
		int B  = 2;
		System.out.println("solve: "+solve(A,B));
		}
	
	
    public static int solve(ArrayList<Integer> A, int B) {
    	int count =0;
    	int sum = 0;
    	for(int i=0; i<A.size()-1;i++) {
    		sum += A.get(i);
    		if(B == sum) {
    			count++;
    	    }
    		if(sum > B) {
    			sum = 0;
    		}
    	}
        return count;
    }
    public static int solve2(ArrayList<Integer> A, int B) {
    	int count =0;
    	int sum = 0;
    	for(int i=0; i<A.size()-1;i++) {
    		for(int j=i+1; j<A.size();j++) {
    			int a = A.get(i) ;
    			int b = A.get(j);
        		if(a+b == B) {
    			count ++;
    		} 
    	}
    	}
        return count;
    }
	
	
	public static int ff(int n) {
		if (n <1)
			return 1;
		
		return ff(n-1) + ff(n-2);
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


	public static boolean isValid2(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			}else {

				if(stack.isEmpty()) {
					return false;
				}
				char ch = stack.pop();
				if((s.charAt(i) == ')' && ch =='(' )
						|| (s.charAt(i) == '}' && ch =='{')
						|| (s.charAt(i) == ']' && ch =='[')) {
					continue;
				}else {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	//1,2,2,3
	//2==2
	public static int removeDuplicates(int[] nums) {
		nums =new int[] {1,1,2};
		int left=1;
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] != nums[i+1]) {
				nums[left]=nums[i+1];
				left++;
			}
		}

		return left;

	}

	public static int removeElement(int[] nums, int val) {
		nums = new int[] {3,2,2,3};
		val = 3;
		int left =0;
		for(int right = 0; right<nums.length; right++) {
			if(nums[right] != val) {
				nums[left]= nums[right];
				left++;
			}
		}

		return left;
	}

	public static  int maxSubArray(int[] nums) {
		nums = new int[] {-2,-3,-4,-1,-5};
		int sum = 0;
		int max =Integer.MIN_VALUE;
		for(int i=0; i<nums.length; i++) {
			sum = sum +nums[i];
			if(sum > max) {
				max = sum;
			}

			if(sum < 0) {
				sum = 0;
			}
		}
		return max;

	}
	public static int lengthOfLastWord(String s) {
		String[] str = s.split(" ");
		String lastStr = str[s.length()-1];
		return lastStr.length();

	}

	public static int searchInsert(int[] nums, int target) {
		nums = new int[] {1,3,5,6};
		target = 2;
		int start = 0;
		int end = nums.length-1;

		while(start <= end){
			int d = (start+end)/2;
			//int mid = start + ( end - start)/2 ;
			if( target < nums[d]){
				end = d - 1;

			}
			else if(target > nums[d]){
				start = d+1;
			}
			else{
				return d;
			}
		}
		return end+1;

	}

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int n: nums) {
			if(!set.add(null)) {
				return true;
			}
		}
		return false;
	}

	public static int search(int[] nums, int target) {
		nums = new int[] {-1,0,3,5,9,12};
		target =	13;
		int start=0;
		int end = nums.length;
		while(start<end) {
			int mid = (start + end)/2;
			if(nums[mid] > target) {
				end = mid-1;
			} else if (nums[mid] < target) {
				start = mid +1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	public static int strStr(String haystack, String needle) {
		haystack = "abc";
		needle = "c";
		if(haystack == null || needle == null || needle.length()>haystack.length()) 
			return -1;
		if(needle.length() == 0) 
			return 0;
		for(int i=0;i<haystack.length() - needle.length() +1; i++) {
			if(haystack.charAt(i) == needle.charAt(0)) {
				if(haystack.substring(i, needle.length()+i).equals(needle)) {
					return i;
				}
			}
		}

		return -1;
	}

	public static int[] plusOne(int[] digits) {
		digits = new int[]{9,9,9};
		for(int i = digits.length -1; i>=0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i]= 0;		
		}
		int[] newArray = new int[digits.length+1];
		newArray[0] =1;
		return newArray;

	}

	public static int climbStairs(int n) {
		int a =0, b=1;
		int c = a+b;
		if(n == 1 || n == 2) {
			return n;
		}
		for (int i=0; i<=n;i++) {
			a=b;
			b=c;
			c = a+b;
		}
		return c;
	}
	
    public  static String addBinary(String a, String b) {
    	a = "11";
    	b= "1";
    	String s="";
    	StringBuilder sb = new StringBuilder();
    	int c =0;
    	int i =0;
    	int alen = a.length();
    	int blen = b.length();
    	while(i<alen || i< blen || c !=0) {
    		int x = 0;
    		int y = 0;
    		if(i<alen && a.charAt(alen-1-i)=='1') {
    			x =1;
    		}
    		if(i<blen && b.charAt(blen-1-i)=='1') {
    			y = 1;
    		}
    		
    		s = (x+y+c)%2 +s ;
    		c = (x+y+c)/2;
    		i++;
    	}
    	return s;
        
    }
}
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



