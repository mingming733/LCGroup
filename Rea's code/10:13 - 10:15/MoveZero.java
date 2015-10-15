
public class MoveZero {
	public void moveZeros(int []nums){
		if (nums == null || nums.length == 0){
			return;
		}
		int numberOfNonZero = 0;
		for (int i = 0; i < nums.length; i ++){
			if (nums[i] != 0){
				swap (i, numberOfNonZero, nums);
				numberOfNonZero ++;
			}
		}
	}
	private void swap (int i, int j, int [] nums){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
