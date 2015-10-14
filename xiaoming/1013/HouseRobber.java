
public class HouseRobber {
	public int rob(int[] nums) {
        int max_rob = 0;
        int max_skip = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int temp = max_rob;
            max_rob = max_skip + nums[i];
            max_skip = Math.max(temp, max_skip);
        }
        return max_rob > max_skip ? max_rob : max_skip;
    }
}
