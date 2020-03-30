package leetcode;

public class HouseRobbers_198 {
//	You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//	Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
//
//	Example 1:
//
//	Input: [1,2,3,1]
//	Output: 4
//	Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//	             Total amount you can rob = 1 + 3 = 4.
//	Example 2:
//
//	Input: [2,7,9,3,1]
//	Output: 12
//	Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
//	Total amount you can rob = 2 + 9 + 1 = 12.
	
	public static int rob(int[] nums) {
      
        int first,second, even;
        first = second = even = 0;
        
        if(nums.length == 0){
            return 0;
        }
        
        if(nums.length % 2 == 0 && nums.length > 2) {
        	even += nums[0] + nums[nums.length-1];
        }
        
        if(nums.length == 0) {
        	return 0;
        }
        
        for(int i = 0; i<nums.length; i+=2) {
        	first += nums[i];
        }
        for(int i = 1; i<nums.length; i+=2) {
        	second += nums[i];
        }
        int max = 0;
        if(first>second) {
        	max = first;
        	if(even > max) {
        		max = even;
        	}
        }
        else if(second > first) {
        	max = second;
        	if(even>second) {
        		max = even;
        	}
        }
        else if(first == second) {
        	max = first;
        	if(even > max) {
        		max = even;
        	}
        }
        
        return max;
		
    }

	public static void main(String[] args) {
		int[] nums = {100,1,4,9,2,1,100};
		
		System.out.println(rob(nums));
	}
	
}
