public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> rst= new ArrayList<Integer>();
        for(int i=0;i<(1<<n);i++){
            rst.add((i>>1)^i);
        }
        return rst;
    }
}
