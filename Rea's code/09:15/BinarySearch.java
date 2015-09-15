
public class BinarySearch {
	public static int binarySearch (int []nums, int target){
		int start = 0;
		int end = nums.length -1;
		int middle;
		if (nums.length == 0 || nums == null) {
			return -1;
		}
		while (start + 1 < end){
			middle = start + (end - start) /2;
			if (nums [middle] == target){
				end = middle;
			}
			else if (nums [middle] < target){
				start = middle;
			}
			else if (nums [middle] > target){
				end = middle;
			}
		}
		if (nums [start] == target){
			return start;
		}
		else if (nums [end] == target){
			return end;
		}
		else {
			return -1;
		}
		
	}

public static void main (String []args) {
	int []array = {2,5,7,10, 13, 14};
	int a = 9;
	System.out.print(binarySearch (array, a));
	}
}