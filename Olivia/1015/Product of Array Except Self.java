public class Solution {
    public int[] productExceptSelf(int[] nums) {
    //   int total=1;
    // int l=nums.length;
    // for(int n:nums){
    //     total*=n;
    // }
    // int[] rst= new int[l];
    // for(int i=0;i<l;i++){
    //     rst[i]=total/nums[i];
    // }
    // return rst;
    int n = nums.length;
    int[] res = new int[n];
    res[0] = 1;
    for (int i = 1; i < n; i++) {
        res[i] = res[i - 1] * nums[i - 1];
    }
    int right = 1;
    for (int i = n - 1; i >= 0; i--) {
        res[i] *= right;
        right *= nums[i];
    }
    return res;
    }
}
