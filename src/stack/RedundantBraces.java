package stack;

import java.util.Stack;

public class RedundantBraces {

	public static void main(String[] args) {
		String A = "a+b+((b+c))";
		System.out.println("RedundantBraces: "+braces(A));

	}
	public static int braces(String A) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<A.length(); i++){
			char ch = A.charAt(i);
			if(ch == '('){
				stack.push(ch);
			} else if(ch != ')'){
				stack.push(ch);
			} else{
				int count = 0;
				while(stack.pop() != '('){
					count++;
				}
				if(count <2){
					return 1;
				}
			}
		}
		return 0;
	}
}
