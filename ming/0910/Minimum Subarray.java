public class Solution {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int sum = nums.get(0);
        for (int i = 1; i < nums.size(); i++){
            sum = sum <= 0 ? sum + nums.get(i): nums.get(i);
            min = Math.min(min, sum);
        }
        return min;
    }
}

