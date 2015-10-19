
public class FindMinimumInRotatedSortedArray {
	public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int start = 0;
        int end = nums.length -1;
        int mid = 0;
        while(start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] > nums[nums.length - 1]) start = mid + 1;
            else end = mid -1;
        }
        return nums[end + 1];
    }
}
