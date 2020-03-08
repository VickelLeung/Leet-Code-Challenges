package leetcode;

public class numberComplement_476 {

//	Input: 5
//	Output: 2
//	Explanation: The binary representation of 5 is 101 (no leading zero bits), 
//	and its complement is 010. So you need to output 2.
//	
//	Input: 1
//	Output: 0
//	Explanation: The binary representation of 1 is 1 
//	(no leading zero bits), and its complement is 0. So you need to output 0.
	
	public static int findComplement(int num) {
        
        int[] binaryVal = new int[100];
        
        for(int i = 0; i< 100; i++) {
        	binaryVal[i] = (int)Math.pow(2, i);
        }
       
        String r = "";
        
        //convert to binary
        int n = num;
        while(n>0) {
        	
	        if(n%2 == 0) {
	        	r = "0" + r;
	        }
	        else {
	        	r= "1" + r;
	        }
	        
	        n = n/2;
        	
        }
        
//        System.out.println(r);
        
        String reverseBinary ="";
        //convert complement binary
        for(int i = 0; i<r.length(); i++) {
        	      	
	        	if(r.charAt(i) == '0') {
	        		reverseBinary += '1';
	        	}
	        	else {
	        		reverseBinary += '0';
	        	}
         }
            
        System.out.println(reverseBinary);
        
        int binaryNumber = 0;
        int index = 0;
        for(int i = reverseBinary.length()-1; i>0; i--) {
        	if(reverseBinary.charAt(i) == '1') {
        		binaryNumber += binaryVal[index];
        		System.out.print("[i: " + index+" ]");
        	}
        	
        	index++;
        }
        System.out.println("b: " + binaryNumber);
        System.out.println(": " + binaryVal[23]);
        
		return binaryNumber;
    }
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println(findComplement(20161211));
	}
}
