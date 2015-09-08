public class Solution {
    /**
     * @param nums: The rotated sorted array
     * @return: void
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        int max = 0;
        int len = nums.size();
        while (max < len - 1 && nums.get(max) <= nums.get(max + 1)){
            max++;
        }
        rotate(nums, 0, max);
        rotate(nums, max + 1, len - 1);
        rotate(nums, 0, len - 1);
    }
    private void rotate(ArrayList<Integer> nums, int start, int end){
        while (start < end){
            int temp = nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end, temp);
            start++;
            end--;
        }
    }
}
