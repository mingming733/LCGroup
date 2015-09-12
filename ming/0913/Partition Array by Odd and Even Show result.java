public class Solution {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        int odd = 0;
        int even = nums.length - 1;
        
        while (odd < even){
            
            if (nums[odd] % 2 == 1){
                odd++;
                continue;
            }
            
            if (nums[even] % 2 == 0){
                even--;
                continue;
            }
            
            int temp = nums[odd];
            nums[odd] = nums[even];
            nums[even] = temp;
            odd++;
            even--;
        }
    }
}
