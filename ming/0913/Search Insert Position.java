public class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start + 1 < end){
            int mid = start - (start - end)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                end = mid;
            }else{
                start = mid;
            }
        }
        
        if (nums[start] >= target){
            return start;
        }
        return end;
    }
}