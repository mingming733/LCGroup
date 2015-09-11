public class Solution {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(ArrayList<Integer> nums) {
        int newsum=nums.get(0);
        int min=nums.get(0);
        for(int i=1;i<nums.size();i++){
           newsum=Math.min(newsum+nums.get(i),nums.get(i));
           min= Math.min(min, newsum);
        }
        return min;
    }
}