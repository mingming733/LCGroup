
public class SearchInsertPosition {
	public static void main (String[]args){
		int [] a = {2, 5, 7, 10};
		System.out.println (searchInsertPosition (a, 5));
		System.out.println (searchInsertPosition (a, 11));
		System.out.println (searchInsertPosition (a, 2));
		
	}
	public static int searchInsertPosition (int [] A, int target){
		int high = A.length -1;
		int low = 0;
		while (low <=high){
			int mid = low + (high - low)/2;
			if (A[mid] == target){
				return mid;
			}
			else if (A[mid] < target ){
				low = mid + 1;
			}
			else {
				high = mid -1;
			}
		}
		return low;
	}
}
