
public class RemoveDuplicateFromSortedArrayII {
	public int removeDuplicates(int[] nums) {
        // write your code here
        int current = 2;
        int previous = 1;
        if (nums.length <= 2){
            return nums.length;
            
        }
        else {
            while (current < nums.length){
                
                if (nums [current] == nums [previous] && nums [current] == nums [previous -1]){
                    
                    current ++;
                }
                else {
                    
                    previous ++;
                    nums [previous] = nums [current];
                    current ++;
                }
            }
        }
        return previous + 1;
    }
}
