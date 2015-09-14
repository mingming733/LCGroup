
public class partitionArray {
	public int[] partitionArrayTest(int[] nums) {
		int i = 0;
		int j = 1;
		int length = nums.length;
		int temp = 0;
		while ( i < length - j ) {
			if (nums[i] % 2 == 1) {
				i++;
				continue;
			}
			if (nums[length - j] % 2 == 0) {
				j++;
				continue;
			}
			temp = nums[i];
			nums[i] = nums[length - j];
			nums[length - j] = temp;
			i++;
			j++;
		}
		return nums;
	}

}
