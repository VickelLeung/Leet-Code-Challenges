package leetcode;

import java.util.HashMap;

public class ShortDistanceChar_821 {

	 public static int[] shortestToChar(String S, char C) {
	     int[] arr = new int[S.length()];
	     int index = 0;
	     HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
	     int hmIndex = 0;
	     
	     //find all e and put in an array
	     for(int i = 0; i<S.length(); i++){
	    	 if(S.charAt(i) == C) {
	    		 hm.put(hmIndex, i);
	    		 hmIndex++;
	    	 }
	     }
	     
	     //insert into last index;
	     hm.put(hmIndex, S.length());
	     
	     for(int i = 0; i<hm.size(); i++) {
	    	 System.out.println("hash: " + i + " val: " +hm.get(i));
	     }
	     System.out.println();
	     int newIndex = 0;
	     for(int i = 0; i < S.length(); i++) {
	    	 System.out.println("i " + i + " hm " + hm.get(newIndex));

		    	 if(i == hm.get(newIndex)) {
		    		 arr[i] = 0;
		    		 if(i > newIndex)
	    			 newIndex++;
	    		 }else {
	    			if(newIndex != 0) {
		    			int getVal = Math.abs((i - hm.get(newIndex)));
		    			int	getNextVal = Math.abs((i - (hm.get(newIndex - 1))));
		    			
		    			if(getVal > getNextVal)
		    				arr[i] =  getNextVal;
		    			else
		    				arr[i] =  getVal;
	    			}
	    			else
	    				arr[i] =  Math.abs((i - hm.get(newIndex)));
	    		 } 
	     }
	     
	     for(int i = 0; i<arr.length; i++) {
	    	 System.out.print("["+arr[i]+"] ");
	     }
	    
		 return arr;
	}
	
	public static void main(String [] args) {
		
//		String S = "aaba";
//		char C = 'b';
//		String S = "loveleetcode";
//		char C = 'e';
		String S = "aaba";
		char C = 'b';
		
		shortestToChar(S,C);
	}	
}