
public class SearchinRotatedSortedArrayII {
	public boolean search(int[] nums, int target) {
	       if (nums.length == 0 || nums == null){
	            return false;
	        }
	        int start = 0;
	        int end = nums.length -1;
	        int mid;
	        while (start + 1 < end){
	            mid = start + (end - start)/2;
	            if (nums[mid] == target){  //3 3 3 1 2 3 3 target = 1
	                return true;
	            }
	            if (nums[mid] == nums[start]){ //3333 123 target = 1
	                start ++;
	            }
	            else if (nums[mid] > nums[start]){  //345123
	                if (nums[mid] > target && nums[start] <= target){ //target is in first part
	                    end = mid;
	                }
	                else {
	                    start = mid;
	                }
	            }
	            else {
	                if (nums[mid]< target && nums[end] >=target){  //4451234 target = 2
	                    start = mid;
	                }
	                else {
	                    end = mid;
	                }
	            }
	        }
	        if (nums[start] == target){
	            return true;
	        }
	        if (nums[end] == target){
	            return true;
	        }
	        return false;
	    }
}
