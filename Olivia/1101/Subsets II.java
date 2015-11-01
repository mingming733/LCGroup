public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> rst=new ArrayList<List<Integer>>();
        List<Integer> list= new ArrayList<Integer>();
        if(nums==null || nums.length==0){
            return null;
        }
        Arrays.sort(nums);
        helper(rst,list,nums,0);
        return rst;
    }
    public void helper(List<List<Integer>> rst,List<Integer> list, int[] nums, int pos){
        rst.add(new ArrayList<Integer>(list));
        for(int i=pos;i<nums.length;i++){
            if(i!=pos && nums[i]==nums[i-1] ){    //why i!=pos?
                continue;
            }
            list.add(nums[i]);
            helper(rst,list,nums,i+1);
            list.remove(list.size()-1);
        }
    }
    
}
