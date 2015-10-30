
public class SortColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {2,1,0,1,2,1,0};
		sortColor(array);
		for (int i = 0; i < array.length; i ++){
			System.out.print(array[i]);
		}
	}
	public static void sortColor (int[] nums){
		if (nums.length == 0 || nums == null){
			return;
		}
		int red = 0;
		int white = 0;
		int blue = 0;
		for (int i = 0; i < nums.length; i ++){
			if (nums[i] == 0){
				red ++;
			}
			else if (nums[i] == 1){
				white ++;
			}
			else {
				blue ++;
			}
		}
		for (int i = 0; i < nums.length; i ++){
			if (red != 0){
				nums[i] = 0;
				red --;
			}
			else if (white != 0){
				nums[i] = 1;
				white --;
			}
			else {
				nums[i] = 2;
				
			}
		}
	}

}
