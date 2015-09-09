import java.util.*;
public class RecoverRostedSortedArray {
public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        
        for (int i = 1; i < nums.size (); i ++){
            if (nums.get (i-1) > nums.get (i)){
                reverse (nums, 0, i -1);
                reverse (nums, i, nums.size () -1);
                reverse (nums, 0, nums.size () -1);
                
            }
            
        }

        
        
    }
    public void reverse (ArrayList <Integer>nums, int start, int end){
        
        for (int i = start, j = end; i < j; i ++, j --){
            int temp = nums.get (i);
            nums.set (i, nums.get (j));
            nums.set (j, temp);
        }
    }
}
