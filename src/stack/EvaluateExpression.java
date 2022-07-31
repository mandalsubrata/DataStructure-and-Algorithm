package stack;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("4");
		list.add("13");
		list.add("5");
		list.add("/");
		list.add("+");
		System.out.println("EvaluateExpression: "+evalRPN(list));

	}
	public static int evalRPN(ArrayList<String> A) {
		Stack<String> stack = new Stack<>();
		for(String s: A) {
			if(!s.equals("+") && !s.equals("-") && !s.endsWith("/") && !s.equals("*")){
				stack.push(s);
			} else {
				if(stack.isEmpty()){
					return -1;
				}
				int oldVal = Integer.parseInt(stack.pop());
				int newVal = Integer.parseInt(stack.pop());
				switch(s){
				case "*":
					stack.push(""+(newVal * oldVal));
					break;
				case "/":
					stack.push(""+(newVal / oldVal));
					break;
				case "+":
					stack.push(""+(newVal + oldVal));
					break;
				case "-":
					stack.push(""+(newVal - oldVal));
					break;
				}
			}
		}
		if(stack.isEmpty()){
			return -1;
		}
		int k = Integer.parseInt(stack.pop());
		return k;
	}


}

