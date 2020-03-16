package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate_217 {

//	Given an array of integers, find if the array contains any duplicates.
//
//	Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
//
//	Example 1:
//
//	Input: [1,2,3,1]
//	Output: true
//	Example 2:
//
//	Input: [1,2,3,4]
//	Output: false
//	Example 3:
//
//	Input: [1,1,1,3,3,4,3,2,4,2]
//	Output: true
	
   public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        
        if(nums.length==0)
            return false;
       
        
        for(int i = 0; i<nums.length;i++) {
        	
        	if(!hs.add(nums[i])) {
        		return true;
        	}
        }
   
        return false;
    }
	   
	public static void main(String[] args) {
		int[] nums = {
				3,1,1
				
		};
 		
		boolean isContains = containsDuplicate(nums);
		System.out.println(isContains);
	}

}
