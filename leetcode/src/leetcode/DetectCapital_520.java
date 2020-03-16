package leetcode;

public class DetectCapital_520 {
	
//	Given a word, you need to judge whether the usage of capitals in it is right or not.
//
//	We define the usage of capitals in a word to be right when one of the following cases holds:
//
//	All letters in this word are capitals, like "USA".
//	All letters in this word are not capitals, like "leetcode".
//	Only the first letter in this word is capital, like "Google".
//	Otherwise, we define that this word doesn't use capitals in a right way.
//	 
//
//	Example 1:
//
//	Input: "USA"
//	Output: True
//	 
//
//	Example 2:
//
//	Input: "FlaG"
//	Output: False
	
	public static boolean detectCapitalUse(String word) {
        String temp = word;
        
        // all lower case
        if(temp.toLowerCase().equals(word))
        	return true;
		
        // all uppercase
        if(temp.toUpperCase().equals(word))
        	return true;
		
        
        // verify if first character is upper case
        boolean isFirst= false;
        if(temp.substring(0, 1).toUpperCase().equals(word.substring(0,1)))
        	isFirst = true;
        
        if(isFirst) {
	        for(int i = 1; i<word.length(); i++) {
	        	String[] splitTk = word.split("");
	        	System.out.println(splitTk[i].toUpperCase() + " " + splitTk[i]);
 	        	if(splitTk[i].toUpperCase() == splitTk[i])
 	        		return false;
	        }
	        return true;
        }
		return false;
		
    }
	
	public static void main(String[] args) {
		String s = "Leetcode";
		boolean isCapital = detectCapitalUse(s);
		System.out.println(isCapital);
	}
}
