package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class SingleDigit_136 {

/*
 * 
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Input: [2,2,1]
Output: 1

Input: [4,1,2,1,2]
Output: 4

Input: [1,2,1,4,2]
Output: 4

 * 
 * 	
 */
	
	 public static int singleNumber(int[] nums) {
		
		 //base case
		 if(nums.length == 0) return -1;
		 if(nums.length == 1) return nums[0];
		 
		 int index = nums.length-1;
		 for(int i = 0; i < nums.length; i++) {
			 while(index > i) {

				 if(nums[i] == nums[index]) {
					 nums[index] = 0;
					 nums[i] = 0;
					 index = nums.length-1;
					 break;
				 }
				 else
					 index--;
			 }
		 }
		 for(int i = 0; i < nums.length; i++) {
			 if(nums[i] != 0) {
				 return nums[i];
			 }
		 }
		 return -1;
	 }
	 
	 public static void main(String[] args) {
		 
		 int[] nums = {0,0,2,1,2};
		 
		 System.out.println();
		 System.out.println( singleNumber(nums));
		 
	 }
}
