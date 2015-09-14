public class Solution {
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        if (nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            } else {
                
            }
        }
        return nums.length;
    }
}