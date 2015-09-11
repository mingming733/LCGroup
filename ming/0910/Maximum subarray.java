public class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++){
            sum = sum >= 0 ? sum + nums[i]: nums[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}