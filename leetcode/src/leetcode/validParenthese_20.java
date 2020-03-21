package leetcode;

import java.util.Stack;

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Note that an empty string is also considered valid.
//
//Example 1:
//
//Input: "()"
//Output: true
//Example 2:
//
//Input: "()[]{}"
//Output: true
//Example 3:
//
//Input: "(]"
//Output: false
//Example 4:
//
//Input: "([)]"
//Output: false
//Example 5:
//
//Input: "{[]}"
//Output: true

public class validParenthese_20 {

	public static boolean isValid(String s) {
		 
        boolean isParenthese = false;
		
       Stack<Character> stack = new Stack<Character>(); 
       
       if(s.length()==0)
           return true;
       
       if(s.length() %2 == 0) {
       	
       	stack.add(s.charAt(0));
       	for(int i = 1; i<s.length(); i++) {
       		

       		char c = s.charAt(i);
       		
       		if(stack.empty()) {
       			stack.add(c);
       		}
       		else {
	    			if(stack.peek() == '[' && c == ']' 
	    					|| stack.peek() == '{' && c == '}' 
	    					|| stack.peek() == '(' && c == ')' ) {
	    						stack.pop();
	    					
	        		}
	        		else {
	        			stack.add(c);
	        		}
   			}
       		
       	}
	        
       	if(stack.size() == 0)
       		isParenthese = true;
       	
	        
       }
    
		return isParenthese;
    }
	
	
	public static void main(String[] args) {
		String S = "";
		
		System.out.println(isValid(S));
	}
	
}
