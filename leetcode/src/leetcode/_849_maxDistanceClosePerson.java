package leetcode;

public class _849_maxDistanceClosePerson {

    public static int maxDistToClosest(int[] seats) {
        
    	int counter = 0;
    	int max = 0;
    	int index = -1;
    	//find the highest 0's in array
    	System.out.println(seats.length-1);
    	for(int i = 0; i<seats.length; i++) {
    		System.out.println("C:"+counter + " M: " + max);
    		if(seats[i]==1 || i== seats.length-1) {
        		System.out.println("i: "+i);
    			if(counter > max) {
    				if(i== seats.length-1) {
    					index = i;
    				}
    				else {
    					index = i-1;
    				}
	    			max = counter;
    			}
    			counter = 0;
    		}
    		else if(seats[i]==0) {
    			++counter;
    		}
    	}
    	
    	
//    	if(seats[index+1] == 1) {
//    		int x = index;
//    		while(seats[x] != 1) {
//    			
//    			if(x == 0) {
//    				index = 0;
//    				break;
//    			}
//    			
//    			if(seats[x] == 1) {
//    				index = index - (max/2);
//    				break;
//    			}
//    				
//    			x--;
//    		}
//    		
//    	}
    	
    	System.out.println(index);
    	
    	return index;
    }
	
	public static void main(String[] args) {
		int [] seats = {0,0,1,0,0,0};
		
	
		System.out.println(maxDistToClosest(seats));
	}
	
}
