public class Solution {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        if(nums.length < 2) {
          //  nums = nums;
        } else {
            int p = 0;// odd pointer
            int q = 0;// even pointer
            if(nums[0]%2==0){
                p = 1;
                q = 0;
            } else {
                p = 0;
                q = 1;
            }
            
            while(p < nums.length) {
                if(nums[p]%2!=0 && p>q) {
                    nums[q] = nums[p] + nums[q];
                    nums[p] = nums[q] - nums[q];
                    nums[q] = nums[q] - nums[q];
                    q++;
                }
                p++;
            }
        }
        //return nums;
    }
}
