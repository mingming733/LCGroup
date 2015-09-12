
public class LongestIncreasingContinuousSubsequence {
	public int longestIncreasingContinuousSubsequence(int[] A){
		if (A.length == 0 || A == null){
			return 0;
		}
		if (A.length == 1){
			return 1;
		} 
		int count = 1;
		int max = 0;
		for (int i = 1; i < A.length; i ++){
			if (A [ i ] > A [i -1]){
				count ++;
			}
			else {
				count = 1;
			}
			max = Math.max(count, max);
		}
		for (int i = A.length -1; i > 0; i --){
			if (A [i] < A [i -1]){
				count ++;
			}
			else {
				count = 1;
			}
			max = Math.max(max,count);
		}
		return max;
	}

}

