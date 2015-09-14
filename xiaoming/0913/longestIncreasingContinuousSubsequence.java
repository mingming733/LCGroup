

public class longestIncreasingContinuousSubsequence {
	public int longestIncreasingContinuousSubsequenc(int[] nums) {
        if (nums == null || nums.length == 0)  
        	return 0;
        else if (nums.length == 1)
        	return 1;
        else if (nums.length == 2)
        {
        	if (nums[0] != nums[1] )
        		return 2;
        	return 1;
        }
        else 
        {
        	int max = 1;
        	int maxTemp = 2;
        	for (int i = 2; i < nums.length; i++) {
        		if (nums[i-1] == nums[i-2] && nums[i] == nums[i-1])
        			continue;
        		maxTemp = (nums[i] - nums[i-1]) * (nums[i-1] - nums[i-2])
        				> 0 ? maxTemp + 1 : 2;
        		max = Math.max(max, maxTemp);
        	}
        return max;
        }
    }
}
