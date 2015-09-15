class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start + 1 < end){
            int mid = start - (start - end) / 2;
            if (nums[mid] >= target){
                end = mid;
            }else{
                start = mid;
            }
        }
        
        if (nums[start] == target){
            return start;
        }
        if (nums[end] == target){
            return end;
        }
        return -1;
    }
}
