
public class PartitionArrayByOddAndEven {
	public void partitionArrayByOddAndEven(int [] nums) {
		
		int start;
		int end = nums.length;
		if (nums.length == 0 || nums == null){
			return;
		}
		for (start = 0; start < end; start ++){
			if (nums[start] % 2 == 0){
				int temp = nums [start];
				nums [start] = nums [--end];
				nums [end] = temp;
				start --;
			}
		}
	}
}