package Contest181;

import java.util.ArrayList;

public class FourDivisor {
	
//	Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors.
//
//			If there is no such integer in the array, return 0.
//
//			 
//
//			Example 1:
//
//			Input: nums = [21,4,7]
//			Output: 32
//			Explanation:
//			21 has 4 divisors: 1, 3, 7, 21
//			4 has 3 divisors: 1, 2, 4
//			7 has 2 divisors: 1, 7
//			The answer is the sum of divisors of 21 only.
//			 
//
//			Constraints:
//
//			1 <= nums.length <= 10^4
//			1 <= nums[i] <= 10^5
	
	public static int sumFourDivisors(int[] nums) {
		
		int results = 0;
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0; i<nums.length; i++)
		calculate(al, nums[i] );
		
		if(al.size() == 0) {
			return 0;
		}
		else {
			results = 0;
		for(int i = 0; i<al.size(); i++) {
			
			results += al.get(i);
			}
		return results;
		}
    }
	
	public static void calculate(ArrayList al, int target) {
		int divisor = 0;
		int results = 0;
		for(int j = 1; j<= target; j++) {
			if(target % j == 0) {
				results += j;
				divisor++;
			}
			
			if(divisor>5) {
				break;
			}
		}
		if(divisor == 4) {
			System.out.println();
			al.add(results);
		}
	}
	
	public static void main(String[] args) {
		int[] num = {21, 4, 7,};
		System.out.println(sumFourDivisors(num));
		
	}
	
}
