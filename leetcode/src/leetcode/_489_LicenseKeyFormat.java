package leetcode;

public class _489_LicenseKeyFormat {
	public static String licenseKeyFormatting(String S, int K) {
	    String results = ""; 
	    
	    //split the string with hyphens
	    String[] splitStr = S.toUpperCase().split("-");
	    int splitLength = 0;
//	    for(int i = 1; i<splitStr.length; i++) {
//	    	splitLength += splitStr[i].length();
//	    }
	    
	    int index = 0;
	    if(splitStr[0].length() <= K ) {
	    	
	    	results += splitStr[0] + "-";
	    	index = 1;
	    }
	    else {
	    	index = 0;
	    }
	    
	    String groupStr = "";
	    for(int i = index; i<splitStr.length; i++) {
	    	groupStr += splitStr[i];
	    }
	    
	    int counter = 0;
	    for(int i = 0; i<groupStr.length(); i++) {
	    	
	    	if(counter == K) {
	    		results+= "-" + groupStr.charAt(i);
	    		counter= 0;
	    	}
	    	else {
	    		results+= groupStr.charAt(i);
	    		
	    	}
	    	counter++;
	    }

        return results;
    }
	
	public static void main(String[] args) {
		String s ="2-4A0r7-4k";
		int k = 3; 
		
		System.out.println(licenseKeyFormatting(s,k));
	}
}
