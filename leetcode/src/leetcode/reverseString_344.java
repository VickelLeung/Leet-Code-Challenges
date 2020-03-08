package leetcode;

public class reverseString_344 {
	public static void reverseString(char[] s) {
        
		int end = s.length-1;
		for(int i = 0; i<s.length/2; i++) {
//			System.out.println(i+"#s: " + s[i] +" "+ end+ " #e: " + s[end]);
			
			if(i == end) break;
			
				char temp = s[i];
				s[i] = s[end];
				s[end] = temp;
				System.out.println(i+"#s: " + s[i] +" "+ end+ " #e: " + s[end]);
		
			--end;
		}
		
//		for(int i = 0; i<s.length; i++)
//			System.out.print(s[i]);
		
    }
	
	
	public static void main(String[] args) {
		char[] s = {'H','e','l','o','a', 'e'};
	
		reverseString(s);
	}
}
