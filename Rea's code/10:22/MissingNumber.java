
public class MissingNumber {
	public static void main (String []args){
		int [] a = {0,1,2,3,4,6};
		System.out.println (missingNumber (a));
	}
	
	
	
	public static int missingNumber (int []nums){
		int result = 0;
		for (int i = 0; i <= nums.length; i ++){
			result ^= i == nums.length? i : nums[i] ^ i; 
		}
		return result;
	}
}
