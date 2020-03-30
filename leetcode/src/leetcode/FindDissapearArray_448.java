package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDissapearArray_448 {

	 public static List<Integer> findDisappearedNumbers(int[] nums) {
		 List<Integer> list = new ArrayList<Integer>();
		 HashSet<Integer> hs = new HashSet<>();
		 
		 for(int i = 0; i<nums.length; i++) {
			 hs.add(nums[i]);
			 
		 }
		 
		 for(int i = 1; i<=nums.length; i++) {
			 if(hs.add(i)) {
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
