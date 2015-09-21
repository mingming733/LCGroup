public class Solution {
    public void sortColors(int[] nums) {
       if(nums ==null||nums.length<=1){
           return;
       } 
       int b=0;
       int c=nums.length-1;
       int i=0;
       while(i<=c){
           if(nums[i]==0){
               swap(nums,b,i);
               b++;
               i++;
           }
           else if(nums[i]==1){
           i++;
           }
           else{
               swap(nums,c,i);
               c--;
           }
       }
       
    }
    private void swap(int[]nums, int b, int c){
        int temp=nums[b];
        nums[b]=nums[c];
        nums[c]=temp;
    }
}
