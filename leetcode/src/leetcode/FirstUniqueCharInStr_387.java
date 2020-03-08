package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstUniqueCharInStr_387 {
	
//	s = "leetcode"
//			return 0.
//
//	s = "loveleetcode",
//	return 2.
	
//	leetcode -> 0 -> l
//	hello -> 2 -> l
	
//	loveleetcode = 2
//	[l][o][v][e]
  	
//	al-1 for length
	
	 public static int firstUniqChar(String s) {

		 int[] alpha = new int[26];
		 
		 for(int i = 0; i< s.length(); i++) {
		
			alpha[s.charAt(i) - 'a']++;
		 }
		 
		 for(int i = 0; i<s.length(); i++) {
			 System.out.println(alpha[s.charAt(i) - 'a']);
			 if(alpha[s.charAt(i)-'a'] == 1) return i;
		 }
		 
		 
		 return -1;
	}
	
	public static void main(String[] args) {
		String s="hello";
		
		System.out.println(firstUniqChar(s));
		
	}
}