package contest_182;

import java.util.HashMap;

public class luckyNumber {

//	Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value.
//
//	Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no lucky integer return -1.
//
//	Example 1:
//
//	Input: arr = [2,2,3,4]
//	Output: 2
//	Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
//	Example 2:
//
//	Input: arr = [1,2,2,3,3,3]
//	Output: 3
//	Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
//	Example 3:
//
//	Input: arr = [2,2,2,3,3]
//	Output: -1
//	Explanation: There are no lucky numbers in the array.
//	Example 4:
//
//	Input: arr = [5]
//	Output: -1
//	Example 5:
//
//	Input: arr = [7,7,7,7,7,7,7]
//	Output: 7
//	 
//
//	Constraints:
//
//	1 <= arr.length <= 500
//	1 <= arr[i] <= 500
	
	 public static int findLucky(int[] arr) {
	        
		 int counter = 1;
		 HashMap<Integer, Integer> hm = new HashMap<>();
		 for(int i = 0; i<arr.length; i++) {
		 
			 if(hm.containsKey(arr[i])) {
				
				 hm.put(arr[i], (hm.get(arr[i])+1) );
			 }
			 else {
				 hm.put(arr[i],counter);
			 }
			 
		 }
		 int results = -1;
		 int max = 0;
		 for(int i = 0; i<arr.length-1; i++) {
			if(hm.get(arr[i]) == arr[i]) {
				if(max < hm.get(arr[i])) {
					max = arr[i];
				}
			}
		 }
		 if(max > 0) {
			 results = max;
		 }
		 
		 return results;
	 }	
	
	public static void main(String[] args) {
		
		int arr[] = {2,1,3,3,33,3,4};
		 System.out.println(findLucky(arr));
		 
	}
	
}
