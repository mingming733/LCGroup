import java.util.*;
public class MinimumSubarray {
	public int minSubArray(ArrayList<Integer> nums) {
        // write your code
        
        if (nums.size() == 0 || nums == null){
            return 0;
        }
        else {
            int min = nums.get (0);
            int sum = min;
            for (int i = 1; i < nums.size(); i ++){
                int current = nums.get (i);
                sum = Math.min (current, current + sum);
                min = min > sum? sum : min;
                
            }
            return min;
        }
        
        
    }

}
