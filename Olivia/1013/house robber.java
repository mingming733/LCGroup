public class Solution {
    public int rob(int[] nums) {
       int n =nums.length; 
       int []res=new int[nums.length];
       int ans=0;
       if(n==0)
       return 0;
       if(n>=1)
       res[0]=nums[0];
       if(n>=2)
        res[1]=Math.max(nums[0],nums[1]);
        if(n>=3)
        res[2]=Math.max(nums[0]+nums[2],nums[1]);
        if(n>2){
            for(int i=3;i<n;i++){
                res[i]=Math.max(res[i-3],res[i-2])+nums[i];
            }
        }
        for(int i=0;i<n;i++){
            ans =Math.max(ans,res[i]);
        }
        return ans;
    }
}
