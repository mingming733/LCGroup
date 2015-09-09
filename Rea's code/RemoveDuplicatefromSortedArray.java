
public class RemoveDuplicatefromSortedArray {
	public int removeDuplicates(int[] nums) {
        // write your code here
        int i;
        int count = 0;
        
        if (nums.length == 0 || nums == null){
            
            return 0;
        }
        else {
            for (i = 0; i < nums.length; i ++){
                
                if (nums [i] != nums [count]){
                    
                    nums [++ count] = nums [i];
                }
                
            }
        
        }
         return count + 1;   
       
    }
}
