package leetcode;

public class _66_PlusOne {
//	Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
//
//	The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
//
//	You may assume the integer does not contain any leading zero, except the number 0 itself.
//
//	Example 1:
//
//	Input: [1,2,3]
//	Output: [1,2,4]
//	Explanation: The array represents the integer 123.
//	Example 2:
//
//	Input: [4,3,2,1]
//	Output: [4,3,2,2]
//	Explanation: The array represents the integer 4321.
	
	public static int[] plusOne(int[] digits) {

        if(digits[digits.length-1] != 9) {
        	digits[digits.length-1] +=1;
        }
        else {
        	
        	if(digits.length == 1) {
        		digits[digits.length-1] = 10;
        	}
        	else {
        		digits[digits.length-1] +=1;
	        	for(int i = digits.length-1; i>0; i--) {
	        		if(digits[i] > 9) {
	        			digits[i] = 0;
	        			digits[(i-1)] +=1;
	        		}else {
	        			break;
	        		}
	        	}
        	}
        }
           
		int[] results =new int[digits.length+1];
		for(int i = 0; i<digits.length; i++ ) {
			
			if(digits[i] >9) {
				results[i] = 1;
				results[(i+1)] = 0;
 			}
			else {
				results[i]  = digits[i];
			}
		}
		
        return results;
    }
	
	public static void main(String[] args) {
		int arr[] = {4,9,2,9};
			//{5,2,2,6,5,7,1,9,0,3,8,6,8,6,5,2,1,8,7,9,8,3,8,4,7,2,5,8,9};
		int[] t = 	plusOne(arr);
		for(int i = 0; i<t.length; i++)
			System.out.print(t[i] +" ");
	
	}
	
}
