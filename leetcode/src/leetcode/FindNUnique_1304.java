package leetcode;

class FindNUnique_1304 {
    public static int[] sumZero(int n) {
          
        int[] arr = new int[n];
        
        if(n == 1) {
            arr[0] = 0;
            return arr;
        }
        

        boolean isEven = false;
        
        if(n %2 == 0)
            isEven = true;
            
     		int num = 1;
     		int arrIndex = 0;
            for(int i = 0; i < n-1 ; i++){

               if(i%2 == 0) {
            		
                arr[arrIndex] = num; 
                arr[++arrIndex] = num * -1;

                System.out.println("N: "+ num + "\n");
                arrIndex++;
               ++num;
               }
            }
            
            if(!isEven)  
            	arr[n-1] = 0;
               
            int sum = 0;
            for(int x = 0; x<arr.length; x++) {
            	System.out.println("arr: " + arr[x]);
            sum += arr[x];	
            }
            
            System.out.println();
            System.out.println(sum);
            
            	
        return arr;
    }
    
    public static void main(String[] args) {
    	
    	sumZero(1);

    }
    
}