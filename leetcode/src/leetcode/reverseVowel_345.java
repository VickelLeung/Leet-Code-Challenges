package leetcode;

import java.util.HashMap;

public class reverseVowel_345 {
	
	public static String reverseVowels(String s) {
		String reverse="";
		HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
		
		int index =  0;
		for(int i = 0; i<s.length(); i++) {
			char character = s.charAt(i);
			//check if it's a vowel
			if(character == 'a' || character == 'e' || character == 'i' 
					|| character == 'o' || character == 'u'|| character == 'A'
					|| character == 'E'|| character == 'I'|| character == 'O'|| character == 'U') {
				hm.put(index, character);
				index++;
			}
		}
		
		//reverse
		for(int i = 0; i<s.length(); i++) {
			char character = s.charAt(i);
			if(character == 'a' || character == 'e' || character == 'i' 
					|| character == 'o' || character == 'u'|| character == 'A'
					|| character == 'E'|| character == 'I'|| character == 'O'|| character == 'U'){
				reverse += hm.get(--index);
			}
			else {
				reverse += character;
			}
		}
		return reverse;
	}

	public static void main(String[] args) {
		String s = "aA";
		//hello => holle
		//leetcode => leotcede
		
		System.out.println(reverseVowels(s));
	}
	
}
