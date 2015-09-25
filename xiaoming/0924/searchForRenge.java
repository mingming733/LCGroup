
public class searchForRenge {
	
	public static void main(String[] args) {
		int[] test= {1,1,1,2,2,2,3,3,3,4,5,6,7,8,1111};
		int[] result = searchRange(test, 9);
        System.out.println("");
		System.out.println(result[0] + "   " + result[1]);
		
		int[] result2 = searchRange(test, 2);
        System.out.println("");
		System.out.println(result2[0] + "   " + result2[1]);
		
		result[0] = -1; result[1] = -1;
		int target = 2;
		int left = 0;
		int right = test.length - 1;
		int mid = 0;
		while (left <= right) {
			mid = (left + right)/2;
			if (test[mid] == target) {
				result[0] = mid; 
				result[1] = mid;
				break;
			}
			else if (test[mid] < target) left = mid +1;
			else right = mid -1;
		}
		
		if (result[0] == -1) // return if not exist
		{
			System.out.println("");
			System.out.println(result[0] + "   " + result[1]);
			return;
		}
		
		left = 0;
		right = result[0];
		
		while(left <= right) {
			mid = (left+right)/2;
			if(test[left] == target) {
				result[0]= left;
				break;
			}
			else if (test[left] < target && target <= test[mid]) right = mid;
			else left = mid +1;
			
		}
		
		left = result[1];
		right = test.length -1;
		
		while(left <= right) {
			mid = (left+right+1)/2;
			if(test[right] == target) {
				result[1]= right;
				break;
			}
			else if (test[right] > target && target >= test[mid]) left = mid;
			else right = mid -1;
			
		}
		
        System.out.println("");
		System.out.println(result[0] + "   " + result[1]);
	}
	
	public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums == null || nums.length == 0) return result;
        result[0] = searchBinaryStart(nums, 0, nums.length-1, target);
        result[1] = searchBinaryEnd(nums, 0, nums.length-1, target);
        return result;
    }
    
    static int searchBinaryStart(int[] nums, int start, int end, int target) {
        System.out.print("H_");
    	if (start > end) return -1;
        if (nums[start] == target) return start;
        else if (nums[start] < target && nums[(start + end)/2] >= target) 
        		return searchBinaryStart(nums, start, (start + end)/2, target);
        else return searchBinaryStart(nums, (start + end)/2 +1, end , target);
    }
    
    static int searchBinaryEnd(int[] nums, int start, int end, int target) {
        System.out.print("M_");
    	if (start > end) return -1;
        if (nums[end] == target) return end;
        else if (nums[end] > target && nums[(start + end+1)/2] <= target) 
        		return searchBinaryEnd(nums, (start + end+1)/2 , end, target);
        else return searchBinaryEnd(nums, start, (start + end+1)/2 -1, target);
    }

}
