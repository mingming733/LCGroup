
public class PartitionArrayByOddAndEven {
	public static int [] partitionArrayByOddAndEven(int [] nums) {
		//still have question on this solution
		//another solution: using two pointers one for start, one for end, only if start is odd, end is even, 
		//in this case, swap; if not, keep moving.
		
		int start;
		int end = nums.length;
		if (nums.length == 0 || nums == null){
			return null;
		}
		for (start = 0; start < end; start ++){
			if (nums[start] % 2 == 0){
				int temp = nums [start];
				nums [start] = nums [--end];
				nums [end] = temp;
				start --;
			}
		}
		return nums;
	}
	public static void main (String[]args){
		int [] array1 = {2, 2 ,2};
		int [] array2 = partitionArrayByOddAndEven (array1);
		for (int i = 0; i < array2.length; i ++){
			System.out.println (array2[i]);
		}
		
	}
}