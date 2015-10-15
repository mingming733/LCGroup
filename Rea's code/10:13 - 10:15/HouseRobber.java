
public class HouseRobber {
	public int rob (int[] nums){
		if (nums.length == 0 || nums == null){
			return 0;
		}
		int max [] = new int [nums.length + 1];
		max [0] = 0;
		max [1] = nums[0];
		for (int i = 2; i < max.length; i ++){
			max[i] = Math.max(max[i -1], max[i - 2] + nums[i -1]);
		}
		return max[max.length -1];
	}
}
