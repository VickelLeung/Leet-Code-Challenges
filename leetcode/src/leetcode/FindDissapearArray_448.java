package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDissapearArray_448 {

	 public static List<Integer> findDisappearedNumbers(int[] nums) {
		 List<Integer> list = new ArrayList<Integer>();
		 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		 
		 for(int i = 0; i<nums.length; i++) {
			 hm.put(i, nums[i]);
			 
		 }
		 
		 for(int i = 1; i<=nums.length; i++) {
			 if(!hm.containsValue(i)) {
				 list.add(i);
			 }
		 }
		 
		 for(int i = 0; i<list.size(); i++)
			 System.out.print(list.get(i) + " ");
		 
		 return list;
	    }
	 
	 public static void main(String[] args) {
		 int[] n = {4,3,2,7,8,2,3,1};
		 
		 findDisappearedNumbers(n);
	 }
	
}
