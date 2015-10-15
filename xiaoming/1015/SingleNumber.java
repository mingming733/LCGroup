import java.util.HashSet;


public class SingleNumber {
	public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) set.remove(nums[i]);
            else set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return nums[i];
        }
        return 0;
    }
}
