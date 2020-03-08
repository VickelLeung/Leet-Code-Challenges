package leetcode;

public class addDigits_258 {
//	Input: 38
//	Output: 2 
//	Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
//	Since 2 has only one digit, return it.
	
	 public static int addDigits(int num) {
	     
		 int results = num;
		 int l = 0;
		 int r = 0;
		 
		 if(results < 10) return results;
		 
		 //get first digit
		 while(results > 10) {
		 r = results/10;
		 l = results%10;
		
		 results = r + l;
		
		 System.out.println("results: " + results);
		 if(results < 10)
			return results;
		 System.out.println("Right: " + r);
		 System.out.println("Left: " + l);
		 
		 }
		 return -1;
	}
	 
	public static void main(String[] args) {
		
		int num = 3333;	
		System.out.println(addDigits(num));
	}
}
