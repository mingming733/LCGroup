public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i, j = 0;
        for (i = 0; i < nums.length; i++){
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
