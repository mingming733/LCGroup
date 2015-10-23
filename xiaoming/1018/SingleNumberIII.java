
public class SingleNumberIII {
	
	public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        res[0] = 0;
        res[1] = 0;
        for (int i = 0; i < nums.length; i++) {
            res[0] ^= nums[i];
        }
        int mask = (res[0] - 1) ^ (-1) & res[0];
        res[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & mask) == 0)
                res[0] ^= nums[i];
            else res[1] ^= nums[i];
        }
        return res;
    }

}
