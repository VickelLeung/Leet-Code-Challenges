package leetcode;

import java.util.HashMap;

//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//
//You may assume that the array is non-empty and the majority element always exist in the array.
//
//Example 1:
//
//Input: [3,2,3]
//Output: 3
//Example 2:
//
//Input: [2,2,1,1,1,2,2]
//Output: 2

public class MajorityElement_169 {

	public static int majorityElement(int[] nums) {
//		int majorityNum = 0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int half = nums.length/2;
//        System.out.p/rintln("h: " + half);
        for(int i  = 0; i<nums.length; i++) {
        	if(hm.containsKey(nums[i])) {
//        		System.out.println("n: " + nums[i]);
        		int getNum = hm.get(nums[i]);
        		getNum = getNum + 1;
//        		System.out.println("get: " + getNum);
        		hm.put(nums[i], getNum);
//        		System.out.println("contains: " + hm.get(nums[i]));
        	}else {
//        		System.out.println("added " + nums[i]);
        		hm.put(nums[i], 1 );
        	}
        }
       
//		System.out.println("s: " + hm.size());
        for(int i = 0; i<nums.length; i++) {
//        	System.out.println("i " + hm.get(nums[i]));
        	if(hm.get(nums[i]) > half) {
        		return nums[i];
        	}
        }
        
		return -1;
    }
	
	
	public static void main(String[] args) {
		int [] nums = new int[]{ 6, 5, 5 };
 	
 		System.out.println(majorityElement(nums));
		
	}
	
}
