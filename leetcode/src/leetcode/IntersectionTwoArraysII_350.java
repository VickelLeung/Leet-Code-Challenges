package leetcode;

import java.util.ArrayList;

public class IntersectionTwoArraysII_350 {

//	Given two arrays, write a function to compute their intersection.
//
//	Example 1:
//
//	Input: nums1 = [1,2,2,1], nums2 = [2,2]
//	Output: [2,2]
//	Example 2:
//
//	Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//	Output: [4,9]
			
	
	 public static int[] intersect(int[] nums1, int[] nums2) {
		
	
		 ArrayList<Integer> al = new ArrayList<Integer>();
		 
		
		 if(nums1.length>nums2.length) {
			 
			 

			 for(int i = 0; i<nums2.length; i++) {
				 
				 sort(nums1, 0, nums1.length-1);
				 
				 int r = binarySearch(nums1, 0, (nums1.length-1), nums2[i]);
				 System.out.println(r);
				 if(r != -1){
					 al.add(nums1[r]);
					 nums1[r] = -11111111;
				 }
			 }
		 	int[] resultsArr = new int[al.size()];
			
		 	for(int i = 0; i<al.size(); i++) {
				resultsArr[i] = al.get(i);
			}
			
			return resultsArr;	 
		 }
		 else {
			 
			
			 
			 for(int i = 0; i<nums1.length; i++) {
				 sort(nums2, 0 , nums2.length-1);
				 
				 int r = binarySearch(nums2, 0, (nums2.length-1), nums1[i]);
		
				 if(r != -1) {
					 al.add(nums2[r]);
					 nums2[r] = -11111111;
				 }	 
			}
			 
			int[] resultsArr = new int[al.size()];
			for(int i = 0; i<al.size(); i++) {
				resultsArr[i] = al.get(i);
			}
			
			return resultsArr;
		 }
	 }
	 
	 public static int binarySearch(int arr[], int l, int r, int x) {
		 if (r >= l) { 
	            int mid = l + (r - l) / 2; 
	  
	            // If the element is present at the 
	            // middle itself 
	            if (arr[mid] == x) 
	                return mid; 
	  
	            // If element is smaller than mid, then 
	            // it can only be present in left subarray 
	            if (arr[mid] > x) 
	                return binarySearch(arr, l, mid - 1, x); 
	  
	            // Else the element can only be present 
	            // in right subarray 
	            return binarySearch(arr, mid + 1, r, x); 
	        } 
	  
	        // We reach here when element is not present 
	        // in array 
	        return -1;
	 }
	 
	  // Merges two subarrays of arr[]. 
	    // First subarray is arr[l..m] 
	    // Second subarray is arr[m+1..r] 
	   public static void merge(int arr[], int l, int m, int r) 
	    { 
	        // Find sizes of two subarrays to be merged 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	  
	        /* Create temp arrays */
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        /*Copy data to temp arrays*/
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	  
	  
	        /* Merge the temp arrays */
	  
	        // Initial indexes of first and second subarrays 
	        int i = 0, j = 0; 
	  
	        // Initial index of merged subarry array 
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) 
	        { 
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	  
	    // Main function that sorts arr[l..r] using 
	    // merge() 
	    public static void sort(int arr[], int l, int r) 
	    { 
	        if (l < r) 
	        { 
	            // Find the middle point 
	            int m = (l+r)/2; 
	  
	            // Sort first and second halves 
	            sort(arr, l, m); 
	            sort(arr , m+1, r); 
	  
	            // Merge the sorted halves 
	            merge(arr, l, m, r); 
	        } 
	    } 
	
	public static void main(String[] args) {
		
//		int nums1 [] = {1,2,2,1}; 
//		int nums2 [] = {2,2};
		
//		int[] nums1 = {4,9,5};
//		int[] nums2 = {9,4,9,8,4};
		
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {1,1};
		
//		int[] nums1 = {3,1,2};
//		int[] nums2 = {1,1};
		
		int[] results = intersect(nums1, nums2);
	
		for(int i = 0; i<results.length; i++) {
			System.out.print("[" + results[i] +"]");
		}

	}
}
