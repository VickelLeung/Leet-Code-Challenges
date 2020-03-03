package leetcode;

import java.util.HashMap;

public class main {

	
	    public static int reverse(Long x) {
	 
	       HashMap numbers = new HashMap();
	       boolean isNegative = false;
	        
	        String results = ""+ x;
	        String answer = "";
	        
	        if (results.length() == 0) return 0;
	       
	        int index = 0;
	        for(int i = 0; i<results.length(); i++){
	            numbers.put(index, results.charAt(i));
	            index++;
	        }
	        
	        for(int i = 0; index > 0; index--){
	           System.out.println("ans1: " + numbers.get(index-1));
	           
	            if(!numbers.get(index-1).equals('-')){
	                answer+= numbers.get(index-1);
	            }
	            else{
	                isNegative = true;
	            }
	           
	            System.out.println("ans2: " + answer);
	        }
	       
	        
	       //System.out.println(answer.trim());
	       
	        int i = Integer.valueOf(answer.trim());
	        // long l = (long) i;
	        
	        
	        //convert back to negative
	        if(isNegative)
	            return i * -1;		
	        else       
	           return i;	
	      
	       
	    }
	

	public static void main(String[] args) {
		
		
//		System.out.println(reverse(9646324351));
	}
	
}
