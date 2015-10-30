public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rst= new ArrayList<List<Integer>>();
        if(nums.length==0 || nums==null){
            return null;
        }
        
        List<Integer> list = new ArrayList<Integer>();
        helper(rst,list,nums);
        return rst;
    }
    public void helper(List<List<Integer>> rst, List<Integer> list, int[] nums){
        if(list.size()==nums.length){
            rst.add(new ArrayList<Integer> (list));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            helper(rst,list,nums);
            list.remove(list.size()-1);
            
        }
    }
}
