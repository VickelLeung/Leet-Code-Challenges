package leetcode;

import java.util.HashMap;

public class _1347_MinStepAnagram {
	
//	Given two equal-size strings s and t. In one step you can choose any character of t and replace it with another character.
//
//	Return the minimum number of steps to make t an anagram of s.
//
//	An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.
//
//	Example 1:
//
//	Input: s = "bab", t = "aba"
//	Output: 1
//	Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.
//	Example 2:
//
//	Input: s = "leetcode", t = "practice"
//	Output: 5
//	Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
//	Example 3:
//
//	Input: s = "anagram", t = "mangaar"
//	Output: 0
//	Explanation: "anagram" and "mangaar" are anagrams. 
//	Example 4:
//
//	Input: s = "xxyyzz", t = "xxyyzz"
//	Output: 0
//	Example 5:
//
//	Input: s = "friend", t = "family"
//	Output: 4
//	 
//
//	Constraints:
//
//	1 <= s.length <= 50000
//	s.length == t.length
//	s and t contain lower-case English letters only.
	
	public static int minSteps(String s, String t) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++) {
        	
        	if(hm.containsKey(s.charAt(i))){
        		hm.put(s.charAt(i), (hm.get(s.charAt(i))+1) ); 
        	}
        	else {
        		int counter = 1;
        		hm.put(s.charAt(i), counter);
        	}
        }
        
        for(int i = 0; i<t.length(); i++) {   	
        	if(hm.containsKey(t.charAt(i)) && hm.get(t.charAt(i)) > 0 ) {
        		hm.put(t.charAt(i), hm.get(t.charAt(i))-1 );
        	}
        }
        
        int sum = 0;
        for (float f : hm.values()) {
            sum += f;
        }
        System.out.println(sum);
        
		return sum;
    }
	
	public static void main(String[] args) {
		String s="bab";
		String t="aba";
		//s = "anagram", t = "mangaar"
		minSteps(s,t);
		
	}
}
