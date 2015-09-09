import java.util.*;
public class MaxSubarray {
	public int maxSubArray(ArrayList<Integer> nums) {
        // write your code
        if (nums.size() == 0 || nums == null){
            
            return 0;
        }
        else {
            
            int max = nums.get (0);
            int sum = max;
            for (int i = 1; i < nums.size (); i ++){
                
                int current = nums.get (i);
                sum = Math.max (current, current + sum);
                max = max > sum ? max : sum;
            }
            return max;
        }
    }
}
