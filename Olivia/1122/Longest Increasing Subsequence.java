public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums==null ||nums.length==0){
            return 0;
        }
        int[] help=new int[nums.length];
        int max=1;
        help[0]=1;
        for(int i=1;i<nums.length;i++){
            help[i]=1;
            for(int j=i-1;j>=0;j--){
                if(nums[i]>nums[j]){
                    help[i]=Math.max(help[i],help[j]+1);
                    max=Math.max(help[i],max);
                }
            }
        }
        return max;
    }
}
