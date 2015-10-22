
public class MissingNumber {
	public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        if (min != 0 ) return 0;
        if ((max - min) == (nums.length - 1)) return max+1;
        long res = (min + max) * (nums.length + 1) /2 ;
        for (int i = 0; i < nums.length; i++) {
            res -= nums[i];
        }
        return (int)res;
    }

}
