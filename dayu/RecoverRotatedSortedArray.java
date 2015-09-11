import java.util.*;
public class RecoverRotatedSortedArray {
    /**
     * @param nums: The rotated sorted array
     * @return: void
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size()-1; i++){
            if (nums.get(i) > nums.get(i+1)){
                reverse(nums, 0, i);
                reverse(nums, i + 1, nums.size()-1);
                reverse(nums, 0, nums.size()-1);

            }
        }
    }

    public void reverse(ArrayList<Integer> nums, int start, int end){
        for (;start < end; start++,end--){
            int temp = nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end, temp);
        }
    }
}
