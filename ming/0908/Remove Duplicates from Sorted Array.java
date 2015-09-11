public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1){
            return nums.length;
        }
        int cur = nums[0];
        int j = 0;
        for (int i = 1; i < nums.length; i++){
            if (cur != nums[i]){
                j++;
                cur = nums[i];
                nums[j] = nums[i];
            }
        }
        return j + 1;
        
    }
}