package leetcode;

import java.util.HashMap;

public class DuplicateZeroes_1089 {

//Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
//
//Note that elements beyond the length of the original array are not written.
//
//Do the above modifications to the input array in place, do not return anything from your function.
//
// 
//
//Example 1:
//
//Input: [1,0,2,3,0,4,5,0]
//Output: null
//Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
//Example 2:
//
//Input: [1,2,3]
//Output: null
//Explanation: After calling your function, the input array is modified to: [1,2,3] 
	
	public static void duplicateZeros(int[] arr) {

		
		if(arr.length == 0) {
			return;
		}
		
		int [] newArr = new int[arr.length];
		int temp = 0;
		boolean isDuplicate = false;
		
		for(int i = 0; i<arr.length-1; i++) {
			
			if(arr[i] == 0) {
				arr[i+1] = 0;
				
			}
			else {
				newArr[i] = arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+ " ");
	 }
	 

	
	 public static void main(String[] args) {
		 int[] nums = {1,0,2,3,0,4,5,0};
		 
		 //basically shift to right
//		 duplicateZeros(nums);
		 
//		 shiftArray(nums, 1);
		 
		 for(int i = 0; i<nums.length; i++) {
			 System.out.print( nums[i] + " ");
		 }
		 
	 }
}
