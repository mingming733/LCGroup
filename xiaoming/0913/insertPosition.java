// same idea with mine
// code from leetcode
class Solution {
    int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return i;
            
        }
        return nums.length;
    }
}