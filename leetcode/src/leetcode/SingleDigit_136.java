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
	
		 int index = 0;
		 int end = nums.length-1;
		 while(index < end) {
			 
			 if(nums[index] == nums[end]) {
				 System.out.println();
				 nums[index] = -9;
				 nums[end] = -9;
			 }
			 else {
				 end--;
			 }
			 
			 index++;
		 }
		 
		 
		 for(int i =0; i< nums.length; i++) {
			 if(nums[i] != -9) return nums[i];
		 }
		 
//		ArrayList<Integer> ar = new ArrayList<Integer>();
//	
//		 
//		 for(int i = 0; i < nums.length; i++) {
//			ar.add(nums[i]);
//		 }
//		 System.out.println(ar.size());
//		 //221
//		 for(int i = 0; i<ar.size(); i++) {
//			 int temp = nums[i];
//			 System.out.println("t: " + temp);
//			 System.out.println(ar);
//			 ar.remove(temp);
//			 System.out.println("removed: "+ar);
//			 
//			 
//			 if(!ar.contains(temp)) return temp;
//			 else ar.remove(temp);
//			 System.out.println("removed2: "+ar);
//			 System.out.println();
//		 }
		 
		 
		 return -1;
	 }
	 
	 
	 public static void main(String[] args) {
		 
		 int[] nums = {1,2,1,4,2};
		 
		 System.out.println();
		 System.out.println( singleNumber(nums));
		 
	 }
	
}
