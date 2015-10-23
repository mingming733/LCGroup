
public class SingleNumber2 {
	public int singleNumber(int[] nums) {
        int res = 0;
        int toAnd = 1;
        for (int i = 0; i < 32; i++) {
            toAnd = (1 << i);
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & toAnd) != 0) count++;
            }
            if ((count % 3) != 0) res ^= toAnd;
        }
        return res;
    }

}
