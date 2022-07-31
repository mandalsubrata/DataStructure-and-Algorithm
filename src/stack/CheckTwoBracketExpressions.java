package stack;

import java.util.Stack;

public class CheckTwoBracketExpressions {

	public static void main(String[] args) {
		//String A = "-(a+b+c)";
		//String B = "-a-b-c";
		String A =  "-(-(-(-a+b)-d+c)-q)";
		String B = "a-b-d+c+q";
		System.out.println("CheckTwoBracketExpressions: "+solve(A, B));

	}
	    public static int solve(String A, String B) {
	        Stack<Character> stack = new Stack<>();
	        boolean bracket = false;
	        char oparend = ' ';
	        for(int i=0; i<A.length(); i++){
	            char ch = A.charAt(i);
	            if(ch != '(' && ch != ')'){
	                if(ch == '+' || ch == '-'){
	                
	                    if(!bracket){
	                        stack.push(ch);
	                        oparend = ch;
	                    }else {
	                    	if(!stack.isEmpty())
	                    		oparend = stack.pop();
	                        if(oparend == ' '){
	                            stack.push(ch);
	                        }else if(oparend == '-' && ch == '-'){
	                            stack.push('+');
	                        } else if(oparend == '-' && ch == '+'){
	                            stack.push('-');
	                        } else if(oparend == '+' && ch == '-'){
	                            stack.push('-');
	                        } else {
	                            stack.push('+');
	                        }
	                    }
	                } else {
	                    stack.push(ch);
	                }
	            } else {
	                if(ch == '('){
	                    bracket = true;
	                } else {
	                    bracket = false;
	                    oparend = ' ';
	                }
	            }
	        }
	        StringBuilder sb = new StringBuilder();
	        while(!stack.isEmpty()){
	            sb.append(""+stack.pop());
	        }
	        
	        String old = sb.reverse().toString();
	        if(B.charAt(0)=='(' && B.charAt(B.length()-1)==')') {
	        	B = B.substring(1, B.length()-1);
	        }
	        if(old.equals(B)){
	            return 1;
	        } else {
	            return 0;
	        }
	    }

}