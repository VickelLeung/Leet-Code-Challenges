package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class happyNumber_202 {
	
	public static boolean isHappy(int n) {
		
        
     
       while(true) {
    	   int sum = 0;
    	   int remainder = 0;
    	   if(n > 0) {
    		   remainder = n%10;
    		   sum = remainder * remainder;
    		   n = n/10;
    	   }
    	 
    	   if(sum == 1) return true;
    	   else n = sum;
       
       
       }
	}
		
	public static void main(String[] args) {
		int num= 2;
		
//		49 = 16 + 81 = 97
// 		97 = 81 + 49 = 130
//		130 = 1 + 9 + 10
//		1 0 = 1 
		
		
		System.out.println(isHappy(num));
		
	}
	
}
