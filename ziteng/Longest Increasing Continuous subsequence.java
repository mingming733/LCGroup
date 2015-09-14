public class Solution {
    /**
     * @param A an array of Integer
     * @return  an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        if(A.length==0) return 0;
        int res = 0;
        int temp = 0;
        int up = 0;
        int down = 0;
        for(int i = 1; i < A.length; i++) {
            if(A[i]>A[i-1]) {
                up++;
                down = 0;
            }
            if(A[i]<A[i-1]) {
                down++;
                up = 0;
            }
            temp = Math.max(up,down);
            res = Math.max(temp,res);
        }
        return res+1;
    }
}
