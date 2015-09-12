import java.util.*;
public class MinimumSubarray {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(ArrayList<Integer> nums) {
        // write your code
        if (nums == null) return 0;
        int sum = nums.get(0);
        int min = sum;
        for (int i = 1; i < nums.size(); i++) {
            sum = Math.min(nums.get(i), sum + nums.get(i));
            min = min > sum ? sum : min;
        }
        return min;

    }
}
