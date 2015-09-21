
public class sortColors {
	
	
	public void sortColor(int[] nums) {
		
		if(nums==null)   return;
	 
	    int[] countArray = new int[3];
	    countArray[0] = 0;
	    countArray[1] = 0;
	    countArray[2] = 0;

	    for(int i=0; i<nums.length; i++){
	        countArray[nums[i]]++;
	    }
	    
	    for(int i=0; i<countArray[0]; i++){
	    	nums[i] = 0;
	    }
        
	    for(int i=countArray[0]; i<countArray[0]+countArray[1]; i++){
	    	nums[i] = 1;
	    }
	    
	    for(int i=countArray[1]; i<countArray[2]+countArray[1]; i++){
	    	nums[i] = 2;
	    }
    }

}
