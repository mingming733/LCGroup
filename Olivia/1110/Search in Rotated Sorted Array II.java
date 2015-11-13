public class Solution {
    public boolean search(int[] nums, int target) {
        boolean rst=false;
        for(int n: nums){
            if(n==target){
                rst= true;
            }
        }
        return rst;
    }
}
