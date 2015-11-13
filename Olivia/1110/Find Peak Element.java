public class Solution {
    public int findPeakElement(int[] nums) {
        int i=0; int max=nums[i];
        int rst=0;
        for(i=1;i<nums.length;i++){
            if (max<nums[i]){
                max=nums[i];
                rst=i;
            }
        }
        return rst;
    }
}
