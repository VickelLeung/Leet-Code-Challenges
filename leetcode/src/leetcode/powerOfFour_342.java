package leetcode;

public class powerOfFour_342 {
	
	public static boolean isPowerOfFour(int num) {
	        
		 	int results = 0;
	        if(num == 1) return true;
			int pow = num*num*num*num;
			
			System.out.println(pow);
			if(num % 4 == 0)
				return true;
			else
				return false;
	}
	
	public static void main(String[] args) {
		
		int num = 8;
		
		System.out.println(isPowerOfFour(num));
	}
	
}
