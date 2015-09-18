
public class minimumSubarraySum {
	public int minimumSubarraySumSearch(int[]nums, int s) {
	    if (nums == null || nums.length == 0) {
	        return 0;
	    }
	    int min = nums.length + 1;
	    int[] sum = new int[nums.length + 1];
	    sum[0] = 0;
	    for (int i = 0; i < nums.length; i++) {
	        sum[i + 1] = sum[i] + nums[i];
	        if (sum[i + 1] >= s) {
	            int left = binarySearch(sum, sum[i + 1] - s, 0, i + 1);
	            min = Math.min(min, i + 1 - left);
	        }
	    }
	    return min == nums.length + 1 ? 0 : min;
	}
	 
	private int binarySearch(int[]nums, int target, int start, int end) {
	    while (start + 1 < end) {
	        int mid = start + (end - start) / 2;
	        if (nums[mid] >= target) {
	            end = mid;
	        } else {
	            start = mid;
	        }
	    }
	    if (nums[end] <= target) {
	        return end;
	    } else {
	        return start;
	    }
	}
}
