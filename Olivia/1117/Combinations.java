public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> rst= new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        helper(rst,list,n,k,1);
        return rst;
    }
    public void helper(List<List<Integer>> rst, List<Integer> list,int n,
    int k, int start){
       if (list.size() == k){
            rst.add(new ArrayList(list));
            return;
        }
        for(int i = start; i<= n; i++){
            list.add(i);
            helper(rst, list, n, k, i+1); 
            list.remove(list.size() - 1);
    }
}
}
