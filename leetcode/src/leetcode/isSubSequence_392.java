package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class isSubSequence_392 {

    public static  boolean isSubsequence(String s, String t) {        
    	int index = 0;
    	int counter=0;
    	
    	while(index < s.length()) {
    		
    		System.out.println("i: "+ index);
    		System.out.println("c: " + counter);
    		if(s.charAt(index) == t.charAt(counter)) {
    			index++;
    		}
    		counter++;
    		
    		if(index == s.length()) {
        		return true;
        	}
    		if(counter == t.length()) {
    			return false;
    		}
    	}
    	return false;
    }
	
	public static void main(String[] args) {
		
		String s="axc";
		String t="ahbgdc";
		
		System.out.println(isSubsequence(s,t));
	}
}