package leetcode;

import java.util.HashMap;

public class RelativeRanks_506 {

    public static String[] findRelativeRanks(int[] nums) {
        
    	String[] results = new String[nums.length];
    	HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();

    	mergeSort(nums, 0, nums.length-1);
    	
    	for(int i = 0; i<nums.length; i++) {
    		String temps = "";
    		if(i == 0) {
    			temps = "Gold Medal";
    		}
    		else if(i==1) {
    			temps = "Silver Medal";
    		}
    		else if(i==2) {
    			temps = "Bronze Medal";
    		}
    		else {
    			temps = ""+nums[i];
    		}
    			
    		results[i] = temps;
    			
    	}
    		for(int i = 0; i<results.length; i++)
    			System.out.println(results[i]  +" ");
    	
    	return results;
    }
    
    public static void mergeSort(int[]arr, int l, int r) {
    	
    	if(r <= l) return;
    	int mid = (l+r)/2;
    	mergeSort(arr, l, mid);
    	mergeSort(arr, mid+1, r);
    	merge(arr, l, mid, r);
    	
    }
    
    public static void merge(int[]arr, int l, int m, int r) {
    	int lengthL = m - l +1;
    	int lengthR = r-m;
    	
    	int lArr[] = new int[lengthL];
    	int rArr[] = new int[lengthR];
    	
    	for(int i = 0; i<lengthL; i++) {
    		lArr[i] = arr[l+i];
    	}
    	
    	for(int i = 0; i<lengthR; i++) {
    		rArr[i] = arr[m+i+1];
    	}
    	
    	int lIndex = 0;
    	int rIndex = 0;
    	
    	for(int i = l; i<r+1; i++) {
    		if(lIndex < lengthL && rIndex < lengthR) {
    		
    		if(lArr[lIndex] < rArr[rIndex]) {	
    			arr[i] = lArr[lIndex];
    			lIndex++;
    		}
    		else {
    			arr[i] = rArr[rIndex];
    			rIndex++;
    		}
    	  }
    		else if(lIndex < lengthL) {
    			arr[i] = lArr[lIndex];
    			lIndex++;
    		}
    		else if(rIndex < lengthR) {
    			arr[i] = rArr[rIndex];
    			rIndex++;
    		}
    	}
    }
    
    public static void main(String[] args) {
    	int[] num = {10,3,8,9,4};
    	
    	findRelativeRanks(num);
    }
	
}
