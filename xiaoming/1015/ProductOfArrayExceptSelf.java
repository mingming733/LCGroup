
public class ProductOfArrayExceptSelf {
	
	public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length <= 1) return nums;
        int[] res = new int[nums.length];
        int tempProduct = 1;
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i-1] * nums[i-1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            tempProduct *= nums[i+1];
            res[i] *= tempProduct;
        }
        return res;
    }

}
