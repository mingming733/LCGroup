public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> rst=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        int[] candidates={1,2,3,4,5,6,7,8,9};
        help(rst,list,k,n,0,candidates);
        return rst;
    }
    public void help(List<List<Integer>> rst,List<Integer> list, int k, int n, int start,int[] candidates){
        if(n<0) return;
        if(n==0){
            if(list.size()==k){
            rst.add(new ArrayList<Integer>(list));
            }
            else{
                return;
            }
        }
        for (int i=start;i<candidates.length;i++){
          list.add(candidates[i]);
          help(rst,list,k,n-candidates[i],i+1,candidates);
          list.remove(list.size()-1);
        }
    }
}
