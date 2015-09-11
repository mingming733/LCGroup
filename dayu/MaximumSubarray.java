public class MaximumSubarray {
    public int maximumSubArray(int[] nums) {
        if (nums == null) return 0;
        int max = nums[0];
        int sum = max;
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], nums[i] + sum);
            max = (max > sum) ? max : sum;
        }
        return max;
    }
}
