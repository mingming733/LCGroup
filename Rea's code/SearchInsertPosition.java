
public class SearchInsertPosition {
	public int searchInsertPosition (int [] A, int target){
		int index = 0;
		if (A.length == 0 || A == null){
			return 0;
		}
		for (int i = 0; i < A.length; i ++){
			if (A [i] == target){
				index = i;
			}
			else if (A [i] < target){
				A [i] = target;
				index = i + 1;
			}
			
		}
		return index;
	}
}
//another method can use binary search