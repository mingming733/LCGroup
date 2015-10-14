
public class moveZeros {
public void moveZeroes(int[] nums) {
        
        if (nums == null || nums.length == 0) return;
        int start = 0;
        int end = nums.length -1;
        while(start < end) {
            if (nums[start] != 0) {
                start++;
                continue;
            }
            if (nums[end] == 0) {
                end--;
                continue;
            }
            for(int i = start; i < end; i++) {
                nums[i] = nums[i+1];
            }
            nums[end] = 0;
            end--;
        }
        
    }
}
