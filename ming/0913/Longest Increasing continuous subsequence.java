public class Solution {
    /**
     * @param A an array of Integer
     * @return  an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        if (A.length < 3){
            return A.length;
        }

        int max = 0;
        int localMax = 1;
        if (A[0] >= A[1]){      //好像test case是默认没有重复数字的
            localMax = -2;
        }else{
            localMax = 2;
        }

        for ( int i = 2; i < A.length; i++){
            if (localMax >= 0){
                if (A[i] > A[i - 1]){
                    localMax++;
                }else{
                    localMax = -2;
                }
            }else{
                if (A[i] < A[i - 1]){
                    localMax--;
                }else{
                    localMax = 2;
                }
            }
            max = Math.max(max, Math.abs(localMax));
        }
        return max;
    }
}
